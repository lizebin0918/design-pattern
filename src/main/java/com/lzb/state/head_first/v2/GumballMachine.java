package com.lzb.state.head_first.v2;

import lombok.Data;

/**
 * <br/>
 * Created on : 2021-10-06 14:07
 *
 * 新增需求：满足一定概率需要发两颗糖
 * 为什么要加WinnerState，而不是在在SoldState发两颗糖？
 * 如果这样就把两个状态用一个状态类表示了，减少了代码，但是牺牲了可扩展性。如果有一天中奖规则变了，那就要回头改SoldState，弄不好把以前的逻辑改了
 *
 * @author lizebin
 */
@Data
public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    int count = 0;
    State state = soldOutState;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("发糖.........");
        if (count > 0) {
            count -= 1;
        }
    }

}
