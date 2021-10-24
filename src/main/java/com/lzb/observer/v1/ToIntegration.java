package com.lzb.observer.v1;

/**
 * 送积分<br/>
 * Created on : 2021-06-18 10:42
 *
 * @author chenpi
 */
public class ToIntegration implements RegistObserver {

    @Override
    public void postHandler(Member member) {
        System.out.println("赠送积分:" + member.getName());
    }
}
