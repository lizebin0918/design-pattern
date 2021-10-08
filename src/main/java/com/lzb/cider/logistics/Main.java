package com.lzb.cider.logistics;

import com.lzb.cider.logistics.component.entity.Channel;
import com.lzb.cider.logistics.component.entity.Country;
import com.lzb.cider.logistics.component.entity.Range;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 订单根据后台配置的物流规则，选出符合规则的物流渠道<br/>
 * Created on : 2021-09-27 22:41
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        Order order1 = new Order(1, new BigDecimal("10"), new Country("England"), new Channel("pc"));
        Order order2 = new Order(2, BigDecimal.ZERO, new Country("China"), new Channel("shopify"));

        RuleContent ruleContent = new RuleContent();
        ruleContent.setAmountRange(new Range(new BigDecimal(5), new BigDecimal(100)));
        ruleContent.setChannels(Set.of(new Channel("pc"), new Channel("shopify")));
        ruleContent.setCountries(Set.of(new Country("China")));
        Rule rule = new Rule("只走中国和法国", 1, ruleContent, "规则1-匹配");


        // 数据库查询
        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        List<Rule> ruleList = new ArrayList<>();
        ruleList.add(rule);

        for (Order orderItem : orderList) {
            List<String> channelList = new LinkedList<>();
            for (Rule ruleItem : ruleList) {
                if (ruleItem.doFilter(orderItem)) {
                    channelList.add(rule.getResult());
                }
            }
            System.out.println("订单-" + orderItem.getOid() + ",匹配物流渠道数:" + channelList);
        }
    }

}
