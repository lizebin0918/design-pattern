package com.lzb.builder.zhangyi.builder;

import com.lzb.builder.zhangyi.OutputPort;

/**
 * <br/>
 * Created on : 2023-08-22 12:57
 * @author lizebin
 */
public class OutputComputerBuilder extends ComputerBuilder {

    @Override
    protected void port() {
        OutputPort outputPort = new OutputPort(90);
        computer.addPort(outputPort);
    }
}
