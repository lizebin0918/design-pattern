package com.lzb.refactor_pratice.length;

/**
 * 获取实际值<br/>
 * Created on : 2022-04-10 15:56
 *
 * @author lizebin
 */
public interface Exchange {

    /**
     * 单位换算
     * @param value
     * @param unit
     * @return
     */
    double exchange(double value, Unit unit);

}
