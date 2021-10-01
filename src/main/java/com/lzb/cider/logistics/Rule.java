package com.lzb.cider.logistics;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.lzb.cider.logistics.component.entity.Channel;
import com.lzb.cider.logistics.component.entity.Country;
import com.lzb.cider.logistics.component.entity.ZipCode;
import com.lzb.cider.logistics.component.filter.ChannelFilter;
import com.lzb.cider.logistics.component.filter.CountryAndZipCodeRuleFilter;
import com.lzb.cider.logistics.component.filter.Filter;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * 规则<br/>
 * Created on : 2021-09-27 22:41
 *
 * @author lizebin
 */
public class Rule {

    /**
     * 标题
     */
    private final String title;

    /**
     * 优先级
     */
    private final Integer priority;

    /**
     * 物流渠道
     */
    private final List<Channel> channelList;

    public Rule(String title, Integer priority, List<Channel> channelList) {
        this.title = title;
        this.priority = priority;
        this.channelList = channelList;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPriority() {
        return priority;
    }

    public List<Channel> getChannelList() {
        return channelList;
    }

    /*---------------------------初始化过滤链表---------------------------*/

    private Filter head, tail;

    public void add(Filter filter) {
        if (head == null && tail == null) {
            head = tail = filter;
        } else {
            tail.setNext(filter);
            tail = filter;
        }
    }

    public boolean filter(Order order) {
        if (head != null) {
            return head.filter(order);
        }
        return true;
    }

    private static final Map<String, Filter> CACHE = new ConcurrentHashMap<>();

    /**
     * 解析字符串，组装Filter
     * @param ruleString
     */
    public void initFilter(String ruleString) throws IllegalArgumentException {
        String key = DigestUtils.md5DigestAsHex(ruleString.getBytes(StandardCharsets.UTF_8));
        CACHE.computeIfAbsent(key, k -> {

            // 添加渠道
            JSONArray channleArray = ((JSONArray) JSONPath.eval(ruleString, "$.orderSource.channel"));
            add(ChannelFilter.getInstance(parseChannels(channleArray)));

            // 添加国家-编码
            JSONArray countryAndZipCode = (JSONArray)JSONPath.eval(ruleString, "$.logistics.countryAndZipCode");
            add(CountryAndZipCodeRuleFilter.getInstance(parseCountryAndZipCode(countryAndZipCode)));

            return head;
        });
    }

    /**
     * 解析渠道
     * @param channels
     * @return
     */
    private Set<Channel> parseChannels(JSONArray channels) {
        if (Objects.isNull(channels) || channels.isEmpty()) {
            return Collections.emptySet();
        }
        return channels.stream().map(item -> new Channel((String)item)).collect(Collectors.toSet());
    }

    /**
     * 解析国家-邮编
     * @param countryAndZipCodeArray
     * @return
     */
    private Map<Country, Set<ZipCode>> parseCountryAndZipCode(JSONArray countryAndZipCodeArray) {
        if (Objects.isNull(countryAndZipCodeArray) || countryAndZipCodeArray.isEmpty()) {
            return Collections.emptyMap();
        }
        // {"country": "The United Kingdom","zipcode": ["91710","55**","**66"]}
        return countryAndZipCodeArray.stream().collect(Collectors.toMap(item -> {
            JSONObject o = (JSONObject) item;
            return new Country(o.getString("country"));
        }, item -> {
            JSONObject o = (JSONObject) item;
            return Optional.ofNullable(o.getJSONArray("zipcode")).orElse(new JSONArray())
                    .stream().map(zc -> new ZipCode((String) zc)).collect(Collectors.toSet());
        }));
    }

}
