package com.lzb.vistor.yanmoshejimoshi.v2.customer;

import com.lzb.vistor.yanmoshejimoshi.v2.visitor.Visitor;
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
    public void accept(Visitor visitor) {
        visitor.visitPersonalCustomer(this);
    }
}
