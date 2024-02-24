package com.lzb.command.lzb1;

import com.lzb.command.lzb1.command.Command;
import lombok.RequiredArgsConstructor;

/**
 * <br/>
 * Created on : 2024-02-24 17:11
 *
 * @author lizebin
 */
@RequiredArgsConstructor
public class MenuItem {

    private final Command command;

    public void click() {
        command.execute();
    }

}
