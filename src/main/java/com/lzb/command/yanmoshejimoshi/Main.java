package com.lzb.command.yanmoshejimoshi;

import com.lzb.command.yanmoshejimoshi.command.Command;
import com.lzb.command.yanmoshejimoshi.command.HuangDouPaiGuTangCommand;
import com.lzb.command.yanmoshejimoshi.command.LiangBanQingGuaCommand;
import com.lzb.command.yanmoshejimoshi.command.XiHongShiChaoJiDanCommand;

/**
 * <br/>
 * Created on : 2022-04-01 11:11
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        Command cmd1 = new HuangDouPaiGuTangCommand();
        Command cmd2 = new LiangBanQingGuaCommand();
        Command cmd3 = new XiHongShiChaoJiDanCommand();

        waiter.order(cmd1);
        waiter.order(cmd2);
        waiter.order(cmd3);

        waiter.orderOver();
    }

}
