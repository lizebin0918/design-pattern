package com.lzb.command.lzb1.command;

import com.lzb.command.lzb1.BoardScreen;
import lombok.RequiredArgsConstructor;

/**
 * <br/>
 * Created on : 2024-02-24 17:46
 *
 * @author lizebin
 */
@RequiredArgsConstructor
public class EditCommand extends Command {

    private final BoardScreen boardScreen;

    @Override
    public void execute() {
        boardScreen.edit();
    }
}
