package com.lzb.observer.v1;

/**
 * <br/>
 * Created on : 2021-06-18 10:50
 *
 * @author chenpi
 */
public class Main {

    public static void main(String[] args) {
        Member m = new Member();
        m.setId(1);
        m.setLoginName("loginName");
        m.setPwd("123456");
        m.setName("name");
        MemberRegistController controller = new MemberRegistController();
        controller.regist(m);
    }

}
