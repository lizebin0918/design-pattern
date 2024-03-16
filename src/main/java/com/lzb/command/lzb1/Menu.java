package com.lzb.command.lzb1;

import com.lzb.decorator.demo1.v2.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * 菜单<br/>
 * Created on : 2024-02-24 17:11
 *
 * @author lizebin
 */
public class Menu {

    private List<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

}
