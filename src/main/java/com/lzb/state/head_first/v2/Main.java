package com.lzb.state.head_first.v2;

/**
 * <br/>
 * Created on : 2021-10-06 15:17
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(5);

        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);
    }

}
