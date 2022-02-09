package com.lzb.pricinple.isp.v1;

import com.lzb.pricinple.isp.TransactionType;

/**
 * 假设有一个银行的系统，对外提供存款、取款和转账的能力。
 * 它通过一个接口向外部系统暴露了它的这些能力，而不同能力的差异要通过请求的内容来区分。
 *
 * 这个类相当于前端请求的参数，本来它作为请求对象，摇身一变，变成了业务处理接口的一部分，
 * 然而，传给它们的 TransactionRequest 却包含所有这些方法，一个对象给所有业务逻辑共用，如果后面需求变化，还要增加一个功能，
 * 继续再 TransactionRequest 垒代码？
 * 如果是用Java，可能感觉不明显，毕竟只是在一个类上面加几个字段而已，怎么改？详情看V2，让 TransactionRequest 充血！！！
 *
 * 类似场景：订单列表查询，根据不同维度查询：
 * 1.收件人相关信息
 * 2.包裹信息
 * 3.订单信息
 * 4.sku信息
 * 根据请求参数的不同，调用每一个维度的微服务进行查询
 *
 * @author lizebin
 */
public class TransactionRequest {

    // 获取操作类型
    TransactionType getType() {
        return null;
    }

    // 获取存款金额
    double getDepositAmount() {
        return 0;
    }

    // 获取取款金额
    double getWithdrawAmount() {
        return 0;
    }

    // 获取转账金额
    double getTransferAmount() {
        return 0;
    }
}