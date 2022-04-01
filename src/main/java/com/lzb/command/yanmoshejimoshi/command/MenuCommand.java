package com.lzb.command.yanmoshejimoshi.command;

import java.util.ArrayList;
import java.util.Collection;

/**
 * （下单）菜单对象<br/>
 * Created on : 2022-04-01 10:18
 *
 * @author lizebin
 */
public class MenuCommand {

    private Collection<Command> commands = new ArrayList<>();

    /**
     * 下单
     * @param cmd
     */
    public void add(Command cmd) {
        commands.add(cmd);
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
