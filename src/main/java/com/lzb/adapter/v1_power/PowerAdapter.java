package com.lzb.adapter.v1_power;
/**
 * 电源<br/>
 * Created on : 2021-05-15 23:06
 * @author lizebin
 */
public class PowerAdapter implements PowerDC5 {

    private Power220V power220V;

    public PowerAdapter(Power220V power220V) {
        this.power220V = power220V;
    }

    @Override
    public int output() {
        int adapterInput = power220V.output();
        int adapterOutput = adapterInput / 44;
        System.out.println("输入电压:" + adapterInput + "V;" + "输出电压：" + adapterOutput + "V");
        return adapterOutput;
    }
}
