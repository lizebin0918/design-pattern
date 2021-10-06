package com.lzb.state.head_first.v1;

import com.alibaba.fastjson.JSON;

/**
 * 糖果机版本1<br/>
 * Created on : 2021-10-06 09:51
 *
 * @author lizebin
 */
public class GumballMachine1 {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT, count = 0;

    public GumballMachine1(int count) {
        this.count = count;
        if (this.count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 投硬币
     */
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("你已经投过币了");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("你投入了一个硬币");
        } else if (state == SOLD_OUT) {
            System.out.println("糖果机售罄");
        } else if (state == SOLD) {
            System.out.println("请等待，我们在准备糖果");
        }
    }

    /**
     * 退回硬币
     */
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("硬币归还");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("你没有投入硬币");
        } else if (state == SOLD) {
            System.out.println("你已经扭动曲柄，不能退硬币");
        } else if (state == SOLD_OUT) {
            System.out.println("硬币已退还");
        }
    }

    /**
     * 扭动曲柄
     */
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("糖果已弹出");
        } else if (state == NO_QUARTER) {
            System.out.println("没有投币，不能扭动");
        } else if (state == SOLD_OUT) {
            System.out.println("没有糖果了");
        } else if (state == HAS_QUARTER) {
            System.out.println("扭动曲柄");
            state = SOLD;
            dispense();
        }
    }

    /**
     * 发放糖果
     */
    public void dispense() {
        if (state == SOLD) {
            System.out.println("糖果正在出售");
            count -= 1;
            // 如果是最后一颗糖....
            if (count == 0) {
                System.out.println("没糖果了....");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("请投币");
        } else if (state == SOLD_OUT) {
            System.out.println("没糖果");
        } else if (state == HAS_QUARTER) {
            System.out.println("没糖果");
        }
    }

    @Override
    public java.lang.String toString() {
        return "GumballMachine1{" +
                "state=" + state +
                ", count=" + count +
                ", String=" + JSON.toJSONString(this) +
                '}';
    }

    public static void main(String[] args) {
        GumballMachine1 machine1 = new GumballMachine1(5);
        machine1.insertQuarter();
        machine1.turnCrank();
        System.out.println(machine1);

        machine1.insertQuarter();
        machine1.ejectQuarter();
        machine1.turnCrank();
    }




}
