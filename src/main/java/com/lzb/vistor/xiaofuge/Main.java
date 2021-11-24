package com.lzb.vistor.xiaofuge;

/**
 * <br/>
 * Created on : 2021-11-24 19:44
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        DataView dataView = new DataView();

        System.out.println("\r\n家长视角访问：");
        // 家长
        dataView.show(new Parent());

        System.out.println("\r\n校长视角访问：");
        // 校长
        dataView.show(new Principal());
    }

}
