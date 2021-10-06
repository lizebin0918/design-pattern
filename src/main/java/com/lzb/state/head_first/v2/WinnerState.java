package com.lzb.state.head_first.v2;

/**
 * <br/>
 * Created on : 2021-10-06 14:04
 *
 * @author lizebin
 */
public class WinnerState implements State {

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        throw new RuntimeException("不要投币...");
    }

    @Override
    public void ejectQuarter() {
        throw new RuntimeException("不要退币...");
    }

    @Override
    public void turnCrank() {
        throw new RuntimeException("不要扭柄...");
    }

    @Override
    public void dispense() {
        System.out.println("恭喜你一个币能得到两颗糖....");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("没糖了.....");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }

        }
    }
}
