package com.lzb.rule.executerule.context;

/**
 * @Author : 
 * @Product : 
 * @Time : 2022/8/17
 * @Desc : 实体上门文Holder
 */
public class EntityContextHolder {

    private static ThreadLocal<RuleBaseEntity> contextThreadLocal = new ThreadLocal<>();

    /**
     * 存入线程副本
     *
     * @param entity
     */
    public static void setContext(RuleBaseEntity entity) {
        contextThreadLocal.set(entity);
    }

    /**
     * 从线程副本取出
     *
     * @return
     */
    public static RuleBaseEntity getContext() {
        return contextThreadLocal.get();
    }
}