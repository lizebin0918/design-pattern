package com.lzb.state.head_first.v2;

/**
 * <br/>
 * Created on : 2021-10-06 14:02
 *
 * @author lizebin
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        // 抛异常
        System.out.println("没糖你投个啥币..你自己退回吧....");
    }

    @Override
    public void ejectQuarter() {
        // 抛异常
        System.out.println("没糖没币，你退币也没用啊");
    }

    @Override
    public void turnCrank() {
        System.out.println("没糖，别扭了...");
    }

    @Override
    public void dispense() {
        System.out.println("没糖发....");
    }
}
