package com.lzb.vistor.yanmoshejimoshi.v2.customer;

import com.lzb.vistor.yanmoshejimoshi.v2.visitor.Visitor;
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

    public abstract void accept(Visitor visitor);

}
