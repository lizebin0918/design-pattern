package com.lzb.zhangyi.v4;

import java.util.ArrayList;
import java.util.List;


public abstract class CdrHandlerV4 {

    protected List<CdrRecordV4> records = new ArrayList<>();
    protected final ICdrConverterV4 converter;

    CdrHandlerV4(ICdrConverterV4 converter) {
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