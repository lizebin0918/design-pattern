package com.lzb.decorator.demo3;

/**
 * 取消订单<br/>
 * Created on : 2022-05-09 17:13
 *
 * @author lizebin
 */
public interface CancelOrder {

    /**
     * 取消操作
     *
     * @param remark
     * @param operatorId
     */
    void cancel(String remark, String operatorId);

}
