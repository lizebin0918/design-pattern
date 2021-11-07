package com.lzb.state.activity.exception;

/**
 * 业务异常<br/>
 * Created on : 2021-11-07 22:06
 *
 * @author lizebin
 */
public class BizException extends RuntimeException {

    public BizException(String msg) {
        super(msg);
    }

}
