package com.lzb.command.yanmoshejimoshi.command;

import com.lzb.command.yanmoshejimoshi.cook.CookApi;

/**
 * 命令接口<br/>
 * Created on : 2022-04-01 10:13
 *
 * @author lizebin
 */
public interface Command {

    /**
     * 厨师
     * @param cook
     */
    void cook(CookApi cook);

    /**
     * 执行对应的命令操作
     */
    void execute();

}
