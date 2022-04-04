package com.lzb.vistor.yanmoshejimoshi.v2.customer;

import com.lzb.vistor.yanmoshejimoshi.v2.visitor.Visitor;
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
    public void accept(Visitor visitor) {
        visitor.visitEnterpriseCustomer(this);
    }
}
