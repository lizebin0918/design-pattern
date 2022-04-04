package com.lzb.vistor.yanmoshejimoshi.v1;

import com.lzb.vistor.yanmoshejimoshi.v1.customer.Customer;
import com.lzb.vistor.yanmoshejimoshi.v1.customer.EnterpriseCustomer;
import com.lzb.vistor.yanmoshejimoshi.v1.customer.PersonalCustomer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 客户管理功能：
 * 公司的客户分类两大类，一类是企业客户，一类是个人客户，现在的功能是能让客户剔除服务申请
 *
 * 这样设计的问题：
 * 在企业客户和个人客户的类中，都分别实现了提出服务请求、偏好分析、价值分析等功能，这些功能的实现代码是混杂在同一个实体对象中
 * 更痛苦的是，采用这样的实现方式，如果要给客户扩展新的功能，比如给不同的客户进行【需求调差】等功能，添加新功能都要改动企业客户和个人客户的类
 *
 * <br/>
 * Created on : 2022-04-04 15:34
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        Collection<Customer> customers = prepareData();

        for (Customer customer : customers) {
            customer.predilectionAnalyze();
            customer.worthAnalyze();
        }


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
