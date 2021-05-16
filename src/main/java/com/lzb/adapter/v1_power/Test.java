package com.lzb.adapter.v1_power;
/**
 * <br/>
 * Created on : 2021-05-15 23:11
 * @author lizebin
 */
public class Test {

    public static void main(String[] args) {
        PowerDC5 powerDC5 = new PowerAdapter(new Power220V());
        powerDC5.output();
    }

}
