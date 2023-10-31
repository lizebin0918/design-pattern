package com.lzb.zhangyi.v3;

import java.util.ArrayList;
import java.util.List;

import com.lzb.zhangyi.v2.CdrRecord;
import com.lzb.zhangyi.v2.ICdrConverter;

/**
 * 直接抽取模板方法<br/>
 * Created on : 2023-08-26 17:08
 * @author mac
 */
public abstract class CdrHandler {

    protected List<CdrRecord> records = new ArrayList<>();
    protected final ICdrConverter converter;

    CdrHandler(ICdrConverter converter) {
        this.converter = converter;
    }

    /**
     * 外部只需要关心handler方法
     */
    public void handler() {
        read();
        write();
    }

    protected abstract void read();

    protected abstract void write();

}
