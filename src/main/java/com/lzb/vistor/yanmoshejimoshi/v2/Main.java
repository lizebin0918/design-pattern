package com.lzb.vistor.yanmoshejimoshi.v2;

import com.lzb.vistor.yanmoshejimoshi.v2.customer.Customer;
import com.lzb.vistor.yanmoshejimoshi.v2.customer.EnterpriseCustomer;
import com.lzb.vistor.yanmoshejimoshi.v2.customer.PersonalCustomer;
import com.lzb.vistor.yanmoshejimoshi.v2.visitor.PredilectionAnalyzeVisitor;
import com.lzb.vistor.yanmoshejimoshi.v2.visitor.ServiceRequestVisitor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * <br/>
 * Created on : 2022-04-04 16:08
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        Context context = new Context();
        prepareData().forEach(context::add);

        ServiceRequestVisitor sv = new ServiceRequestVisitor();
        context.handleRequest(sv);

        PredilectionAnalyzeVisitor pv = new PredilectionAnalyzeVisitor();
        context.handleRequest(pv);

        // 后续可以扩展不同的Visitor....

    }

    private static Collection<Customer> prepareData() {

        ArrayList<Customer> customers = new ArrayList<>();

        Customer c1 = new EnterpriseCustomer();
        c1.setName("ABC集团");
        customers.add(c1);

        Customer c2 = new EnterpriseCustomer();
        c2.setName("CDE集团");
        customers.add(c2);

        Customer c3 = new PersonalCustomer();
        c3.setName("张三");
        customers.add(c3);

        return customers;
    }

}
