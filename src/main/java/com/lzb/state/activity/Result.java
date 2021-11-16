package com.lzb.state.activity;

/**
 * <br/>
 * Created on : 2021-11-07 21:28
 *
 * @author lizebin
 */
public class Result {

    /**
     * 返回码
     */
    private Integer code;

    private String msg;

    /**
     * 业务错误码
     */
    public static final int ERROR_CODE = 3000;

    /**
     * 正确返回结果
     */
    public static final int SUCCESS_CODE = 200;

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 构造结果
     * @param code
     * @param msg
     * @return
     */
    public static Result buildResult(int code, String msg) {
        return new Result(code, msg);
    }

    /**
     * 错误
     * @param msg
     * @return
     */
    public static Result buildErrorResult(String msg) {
        return new Result(ERROR_CODE, msg);
    }
}
