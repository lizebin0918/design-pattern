package com.lzb.rule.executerule.start;

import java.util.List;

import com.lzb.rule.executerule.rules.RuleGroupDriver;


/**
 * @Author : 
 * @Product : 
 * @Time : 2022/8/17
 * @Desc : 规则处理引擎
 */
public class RuleProcessEngine {

    /**
     * 启动
     *
     * @param ruleGroups
     */
    public static void start(List<RuleGroupDriver> ruleGroups) {
        ruleGroups.forEach(RuleProcessEngine::start);
    }

    /**
     * 启动
     *
     * @param ruleGroup
     */
    public static void start(RuleGroupDriver ruleGroup) {
        ruleGroup.process();
    }
}
