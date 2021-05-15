package com.lzb.template;

public abstract class AbstractTemplate {

    /**
     * 模板方法
     */
    public void execute() {
        executeBefore();
        doExecute();
        executeAfter();
    }

    /**
     * 基本方法的声明（由子类实现）
     */
    protected abstract void doExecute();

    /**
     * 基本方法(空方法)
     */
    protected void executeBefore() {
        System.out.println("执行业务逻辑之前~~~");
    }

    /**
     * 基本方法（已经实现）
     */
    protected void executeAfter() {
        System.out.println("执行业务逻辑之后~~~");
    }
}