package com.lzb.facade;

import java.util.ArrayList;
import java.util.List;

public class ElectricBrake {

    List<TurnOff> electrical = new ArrayList<>();

    public ElectricBrake regist(TurnOff turnOff) {
        electrical.add(turnOff);
        return this;
    }

    // 关闭所有电器
    public void turnOffAll() {
        electrical.forEach(TurnOff::turnOff);
    }
}
