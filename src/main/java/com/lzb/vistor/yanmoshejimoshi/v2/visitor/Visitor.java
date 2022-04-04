package com.lzb.vistor.yanmoshejimoshi.v2.visitor;

import com.lzb.vistor.yanmoshejimoshi.v2.customer.EnterpriseCustomer;
import com.lzb.vistor.yanmoshejimoshi.v2.customer.PersonalCustomer;

/**
 * <br/>
 * Created on : 2022-04-04 16:10
 *
 * @author lizebin
 */
public interface Visitor {

    void visitEnterpriseCustomer(EnterpriseCustomer ec);

    void visitPersonalCustomer(PersonalCustomer pc);

}
