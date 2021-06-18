package com.lzb.observer.v1;

import com.lzb.observer.Member;

/**
 * 送优惠券<br/>
 * Created on : 2021-06-18 10:39
 *
 * @author chenpi
 */
public class ToCoupon implements RegistObserver {

    @Override
    public void postHandler(Member member) {
        System.out.println("赠送优惠券:" + member.getName());
    }
}
