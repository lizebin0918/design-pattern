package com.lzb.delegate;
/**
 * <br/>
 * Created on : 2021-05-15 21:38
 * @author lizebin
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Manager manager = new Manager();
        boss.command("A_Module", manager);
    }

}
