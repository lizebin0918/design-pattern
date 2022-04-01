package com.lzb.command.yanmoshejimoshi.command;

import com.lzb.command.yanmoshejimoshi.cook.CookApi;
import lombok.AllArgsConstructor;

/**
 * 西红柿炒鸡蛋<br/>
 * Created on : 2022-04-01 10:16
 *
 * @author lizebin
 */
public class XiHongShiChaoJiDanCommand implements Command {

    /**
     * 厨师
     */
    private CookApi cook;

    @Override
    public void cook(CookApi cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.cook("西红柿炒鸡蛋");
    }
}
