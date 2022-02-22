package com.lzb.factory;

/**
 * 发奖结果反馈对象
 */
public class AwardRsp {

    private String code; // 编码
    private String info; // 描述

    public AwardRsp(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
