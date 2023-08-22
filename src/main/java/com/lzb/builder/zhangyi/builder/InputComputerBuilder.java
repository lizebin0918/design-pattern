package com.lzb.builder.zhangyi.builder;

import com.lzb.builder.zhangyi.InputPort;

/**
 * <br/>
 * Created on : 2023-08-22 12:57
 * @author lizebin
 */
public class InputComputerBuilder extends ComputerBuilder {

    @Override
    protected void port() {
        InputPort inputPort = new InputPort(80);
        computer.addPort(inputPort);
    }
}
