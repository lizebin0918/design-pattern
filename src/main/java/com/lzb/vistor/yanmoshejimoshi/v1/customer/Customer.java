package com.lzb.vistor.yanmoshejimoshi.v1.customer;

import lombok.Data;

/**
 * 客户<br/>
 * Created on : 2022-04-04 15:33
 *
 * @author lizebin
 */
@Data
public abstract class Customer {

    private String customerId;
    private String name;

    public abstract void serviceRequest();

    /**
     * 偏好分析
     */
    public abstract void predilectionAnalyze();

    /**
     * 价值分析
     */
    public abstract void worthAnalyze();

}
