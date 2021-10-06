package com.lzb.state.head_first.v2;

import java.security.SecureRandom;

/**
 * <br/>
 * Created on : 2021-10-06 14:03
 *
 * @author lizebin
 */
public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你投过币了，钱多吗？？");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退币给你了，负分滚粗");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("扭动，出糖");
        // 中奖逻辑，直接跳转到【中奖状态】
        SecureRandom random = new SecureRandom();
        int winner = random.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("先扭柄....");
    }
}
