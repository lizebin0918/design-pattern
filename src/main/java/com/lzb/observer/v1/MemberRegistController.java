package com.lzb.observer.v1;

import java.util.*;

/**
 * 会员注册接口，注册之后需要各种后置操作<br/>
 * Created on : 2021-06-18 10:18
 *
 * @author chenpi
 */
public class MemberRegistController {

    private final MemberRegistService memberRegistService = new MemberRegistService();

    private final List<RegistObserver> list = Collections.synchronizedList(new ArrayList<>());

    {
        list.add(new ToCoupon());
        list.add(new ToIntegration());
    }

    /**
     * 省略dto传参
     * @param member
     */
    public void regist(Member member) {
        Member member1 = memberRegistService.regist(member);

        //各种后置处理
        //postHandler1()
        //postHandler2()
        //postHandler3()
        //postHandler4()
        list.forEach(item -> item.postHandler(member1));
    }

}
