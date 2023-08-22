package com.lzb.builder.zhangyi;

import com.lzb.builder.zhangyi.builder.ComputerBuilder;
import com.lzb.builder.zhangyi.builder.ComputerFactory;
import com.lzb.builder.zhangyi.builder.IOPutComputerBuilder;
import com.lzb.builder.zhangyi.builder.InputComputerBuilder;
import com.lzb.builder.zhangyi.builder.OutputComputerBuilder;

/**
 * 一个电脑类：Computer，由Cpu和多个IO接口组成，采用builder<br/>
 * Created on : 2023-08-22 10:22
 * @author lizebin
 */
public class Main {
    public static void main(String[] args) {
        Computer inputComputer = ComputerFactory.createComputer(new InputComputerBuilder());
        inputComputer.run();

        Computer outputComputer = ComputerFactory.createComputer(new OutputComputerBuilder());
        outputComputer.run();

        Computer ioComputer = ComputerFactory.createComputer(new IOPutComputerBuilder());
        ioComputer.run();
    }
}
