package com.lzb.command.yanmoshejimoshi.cook;

import lombok.extern.slf4j.Slf4j;

/**
 * 凉菜<br/>
 * Created on : 2022-04-01 10:11
 *
 * @author lizebin
 */
@Slf4j
public class CoolCook implements CookApi {

    @Override
    public void cook(String name) {
        log.info(String.format("厨师做凉菜:%s", name));
    }
}
