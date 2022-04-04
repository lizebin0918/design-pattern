package com.lzb.vistor.yanmoshejimoshi.v1.customer;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 个人客服<br/>
 * Created on : 2022-04-04 15:45
 *
 * @author lizebin
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PersonalCustomer extends Customer {

    private String telephone;

    private String name;

    @Override
    public void serviceRequest() {
        System.out.println("客户(" + this.name + ")" + "提出服务请求");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("客户(" + this.name + ")" + "进行偏好分析");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("客户(" + this.name + ")" + "进行价值分析");
    }
}
