package com.lzb.command.yanmoshejimoshi.command;

import com.lzb.command.yanmoshejimoshi.cook.CookApi;
import lombok.AllArgsConstructor;

/**
 * 黄豆排骨汤<br/>
 * Created on : 2022-04-01 10:14
 *
 * @author lizebin
 */
public class HuangDouPaiGuTangCommand implements Command {

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
        cook.cook("黄豆排骨汤");
    }
}
