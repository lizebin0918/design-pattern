package com.lzb.builder.zhangyi;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * 电脑<br/>
 * Created on : 2023-08-22 10:25
 * @author lizebin
 */
@Data
public class Computer {

    private Cpu cpu;
    private List<Port> ports = new ArrayList<>();

    public void addPort(Port port) {
        ports.add(port);
    }

    public void run() {
        System.out.println(String.format("电脑启动: cpu %s ports %s", cpu.getCore(), JSON.toJSONString(ports)));
    }

}
