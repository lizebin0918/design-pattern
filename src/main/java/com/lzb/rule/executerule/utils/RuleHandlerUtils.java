package com.lzb.rule.executerule.utils;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.lzb.rule.executerule.anotation.Rule;
import org.reflections.Reflections;

/**
 * @Author : 
 * @Product : 
 * @Time : 2022/8/19
 * @Desc : 规则处理器工具 可应用于生产环境配置
 */
public class RuleHandlerUtils {

    private RuleHandlerUtils() {
    }

    /**
     * 规则包 可做成配置
     */
    private static final String rulePackage = "com.orangecy.executerule.rules.*";

    /**
     * 获取规则
     *
     * @return
     */
    public static List<Rule> getRules() {
        List<Rule> rules = Lists.newArrayList();
        Reflections reflections = new Reflections(rulePackage);
        Set<Class<?>> allClasses = reflections
                .getTypesAnnotatedWith(Rule.class);
        for (Class<?> glass : allClasses) {
            Rule rule = glass.getAnnotation(Rule.class);
            rules.add(rule);
        }
        return rules;
    }
}
