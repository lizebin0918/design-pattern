package com.lzb.builder.zhangyi.builder;

import com.lzb.builder.zhangyi.InputPort;
import com.lzb.builder.zhangyi.OutputPort;

/**
 * <br/>
 * Created on : 2023-08-22 14:11
 * @author lizebin
 */
public class IOPutComputerBuilder extends ComputerBuilder {

    @Override
    protected void port() {
        computer.addPort(new InputPort(1000));
        computer.addPort(new OutputPort(2000));
    }
}
