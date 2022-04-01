package com.lzb.command.yanmoshejimoshi;

import com.lzb.command.yanmoshejimoshi.command.*;
import com.lzb.command.yanmoshejimoshi.cook.CookApi;
import com.lzb.command.yanmoshejimoshi.cook.CoolCook;
import com.lzb.command.yanmoshejimoshi.cook.HotCook;

import java.util.Map;

/**
 * 服务员<br/>
 * 负责组合菜单，组装整个菜单和具体的厨师
 * Created on : 2022-04-01 10:20
 *
 * @author lizebin
 */
public class Waiter {

    /**
     * 厨师
     */
    private static final CookApi HOT_COOK = new HotCook();
    private static final CookApi COOL_COOK = new CoolCook();

    /**
     * 菜系-厨师映射
     */
    private static final Map<Class<? extends Command>, CookApi> COOK_API_MAP = Map.of(
        HuangDouPaiGuTangCommand.class, HOT_COOK,
        XiHongShiChaoJiDanCommand.class, HOT_COOK,
        LiangBanQingGuaCommand.class, COOL_COOK
    );

    /**
     * 菜单(宏命令)
     */
    private MenuCommand menuCommand = new MenuCommand();

    /**
     * 点菜
     * @param cmd
     */
    public void order(Command cmd) {
        cmd.cook(COOK_API_MAP.get(cmd.getClass()));
        menuCommand.add(cmd);
    }

    /**
     * 点菜完毕
     */
    public void orderOver() {
        this.menuCommand.execute();
    }

}
