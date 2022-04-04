package com.lzb.vistor.yanmoshejimoshi.v2;

import com.lzb.vistor.yanmoshejimoshi.v2.customer.Customer;
import com.lzb.vistor.yanmoshejimoshi.v2.visitor.Visitor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <br/>
 * Created on : 2022-04-04 16:22
 *
 * @author lizebin
 */
public class Context {

    private Collection<Customer> customers = new ArrayList<>();

    public void handleRequest(Visitor visitor) {
        customers.forEach(item -> item.accept(visitor));
    }

    public void add(Customer c) {
        customers.add(c);
    }

}
