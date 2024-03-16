package com.lzb.command.lzb1;

import com.lzb.command.lzb1.command.CreateCommand;
import com.lzb.command.lzb1.command.EditCommand;
import com.lzb.command.lzb1.command.OpenCommand;

/**
 * 主函数<br/>
 *
 * 通过 Command 对象，解开 BoardScreen 和 MenuItem 的耦合，在中间加了一层
 *
 * Created on : 2024-02-24 17:28
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        BoardScreen boardScreen = new BoardScreen();
        MenuItem openMenuItem = new MenuItem(new OpenCommand(boardScreen));
        MenuItem createMenuItem = new MenuItem(new CreateCommand(boardScreen));
        MenuItem editMenuItem = new MenuItem(new EditCommand(boardScreen));

        Menu menu = new Menu();
        menu.addMenuItem(openMenuItem);
        menu.addMenuItem(createMenuItem);
        menu.addMenuItem(editMenuItem);

        openMenuItem.click();
        createMenuItem.click();
        editMenuItem.click();
    }

}
