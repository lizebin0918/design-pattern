package com.lzb.cider.logistics.filter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 订单根据后台配置的物流规则，选出符合规则的物流渠道<br/>
 * Created on : 2021-09-27 22:41
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        Order order1 = new Order(1, BigDecimal.ZERO, "England", new BigDecimal(9));
        Order order2 = new Order(2, BigDecimal.ZERO, "China", new BigDecimal(9));

        Rule rule = new Rule("只走中国和法国", 1, Arrays.asList(new Channel("中国物流"), new Channel("Cider自建物流")));
        rule.add(new WeigthFilter(BigDecimal.ZERO, BigDecimal.TEN));
        rule.add(new CountryFilter(Arrays.asList("China", "France")));


        // 数据库查询
        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        List<Rule> ruleList = new ArrayList<>();
        ruleList.add(rule);

        for (Order orderItem : orderList) {
            List<Channel> channelList = new LinkedList<>();
            for (Rule ruleItem : ruleList) {
                if (ruleItem.handler(orderItem)) {
                    channelList.addAll(rule.getChannelList());
                }
            }
            System.out.println("订单-" + orderItem.getOid() + ",匹配物流渠道数:" + channelList.size());
        }
    }

}
