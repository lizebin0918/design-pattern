package com.lzb.proxy.cache;

import lombok.extern.slf4j.Slf4j;

/**
 * <br/>
 * Created on : 2022-02-23 22:55
 *
 * @author lizebin
 */
@Slf4j
public class Main {

    public static void main(String[] args) throws Exception {
        CacheService proxy_EGM = JDKProxyFactory.getProxy(CacheService.class, EGMCacheAdapter.class);
        proxy_EGM.set("user_name_01", "泽彬");
        String val01 = proxy_EGM.get("user_name_01");
        log.info("缓存服务 EGM 测试，proxy_EGM.get 测试结果：{}", val01);

        CacheService proxy_IIR = JDKProxyFactory.getProxy(CacheService.class, IIRCacheAdapter.class);
        proxy_IIR.set("user_name_01", "泽彬");
        String val02 = proxy_IIR.get("user_name_01");
        log.info("缓存服务 IIR 测试，proxy_IIR.get 测试结果：{}", val02);
    }

}
