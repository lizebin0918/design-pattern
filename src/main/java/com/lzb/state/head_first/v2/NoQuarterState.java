package com.lzb.state.head_first.v2;

/**
 * <br/>
 * Created on : 2021-10-06 14:03
 *
 * @author lizebin
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你投币了~~~~~");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没投币，哪有币还你？");
    }

    @Override
    public void turnCrank() {
        System.out.println("没币你扭啥...");
    }

    @Override
    public void dispense() {
        System.out.println("先投币啊，大锅");
    }
}
