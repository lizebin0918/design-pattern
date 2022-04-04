package com.lzb.vistor.yanmoshejimoshi.v1.customer;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 企业客户<br/>
 * Created on : 2022-04-04 15:42
 *
 * @author lizebin
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EnterpriseCustomer extends Customer {

    /**
     * 联系方式
     */
    private String contract;

    /**
     * 电话
     */
    private String phone;

    @Override
    public void serviceRequest() {
        System.out.println("企业客户" + this.getName() + "提出服务请求");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("现在对企业客户" + this.getName() + "进行产品偏好分析");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("现在对企业客户" + this.getName() + "进行价值分析");
    }
}
