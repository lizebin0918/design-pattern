package com.lzb.command.lzb1.command;

import com.lzb.command.lzb1.BoardScreen;
import lombok.RequiredArgsConstructor;

/**
 * 创建命令<br/>
 * Created on : 2024-02-24 17:45
 *
 * @author lizebin
 */
@RequiredArgsConstructor
public class CreateCommand extends Command {

    private final BoardScreen boardScreen;

    @Override
    public void execute() {
        boardScreen.create();
    }
}
