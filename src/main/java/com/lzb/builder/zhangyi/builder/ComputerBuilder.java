package com.lzb.builder.zhangyi.builder;

import com.lzb.builder.zhangyi.Computer;
import com.lzb.builder.zhangyi.Cpu;

/**
 * <br/>
 * Created on : 2023-08-22 10:30
 * @author lizebin
 */
public abstract class ComputerBuilder {

    protected Computer computer = new Computer();

    public Computer build() {
        return computer;
    }

    public ComputerBuilder cpu() {
        computer.setCpu(new Cpu(4));
        return this;
    }

    protected abstract void port();


}
