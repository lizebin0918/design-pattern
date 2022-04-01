package com.lzb.command.yanmoshejimoshi.cook;

import lombok.extern.slf4j.Slf4j;

/**
 * 热菜<br/>
 * Created on : 2022-04-01 10:08
 *
 * @author lizebin
 */
@Slf4j
public class HotCook implements CookApi {

    @Override
    public void cook(String name) {
        log.info(String.format("厨师正在做热菜:%s", name));
    }
}
