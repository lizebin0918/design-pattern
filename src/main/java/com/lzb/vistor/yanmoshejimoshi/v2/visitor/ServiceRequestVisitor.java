package com.lzb.vistor.yanmoshejimoshi.v2.visitor;

import com.lzb.vistor.yanmoshejimoshi.v2.customer.EnterpriseCustomer;
import com.lzb.vistor.yanmoshejimoshi.v2.customer.PersonalCustomer;

/**
 * <br/>
 * Created on : 2022-04-04 16:18
 *
 * @author lizebin
 */
public class ServiceRequestVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        System.out.println("企业客户" + ec.getName() + "提出服务请求");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        System.out.println("客户(" + pc.getName() + ")" + "提出服务请求");
    }
}
