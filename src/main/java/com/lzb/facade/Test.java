package com.lzb.facade;
/**
 * <br/>
 * Created on : 2021-05-16 11:50
 * @author lizebin
 */
public class Test {

    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        Television television = new Television();
        Computer computer = new Computer();
        ElectricBrake brake = new ElectricBrake();
        brake.regist(fridge).regist(television).regist(computer).turnOffAll();
    }

}
