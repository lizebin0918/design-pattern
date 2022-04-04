package com.lzb.vistor.yanmoshejimoshi.v2.visitor;

import com.lzb.vistor.yanmoshejimoshi.v2.customer.EnterpriseCustomer;
import com.lzb.vistor.yanmoshejimoshi.v2.customer.PersonalCustomer;

/**
 * <br/>
 * Created on : 2022-04-04 16:21
 *
 * @author lizebin
 */
public class PredilectionAnalyzeVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        System.out.println("现在对企业客户" + ec.getName() + "进行产品偏好分析");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        System.out.println("客户(" + pc.getName() + ")" + "进行偏好分析");
    }
}
