package com.lzb.command.yanmoshejimoshi.command;

import com.lzb.command.yanmoshejimoshi.cook.CookApi;
import lombok.AllArgsConstructor;

/**
 * 凉拌青瓜<br/>
 * Created on : 2022-04-01 10:22
 *
 * @author lizebin
 */
public class LiangBanQingGuaCommand implements Command {

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
        cook.cook("凉拌青瓜");
    }
}
