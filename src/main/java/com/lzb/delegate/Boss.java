package com.lzb.delegate;
/**
 * 老板<br/>
 * Created on : 2021-05-15 21:25
 * @author lizebin
 */
public class Boss {

    /**
     * 发送命令
     * @param command
     * @param manager
     */
    public void command(String command, Manager manager) {
        manager.doing(command);
    }

}
