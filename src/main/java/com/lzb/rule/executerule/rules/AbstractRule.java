package com.lzb.rule.executerule.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.lzb.rule.executerule.anotation.Rule;
import com.lzb.rule.executerule.context.EntityContextHolder;
import com.lzb.rule.executerule.context.RuleBaseEntity;
import com.lzb.rule.executerule.handlers.IHandler;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author : 
 * @Product : 
 * @Time : 2022/8/17
 * @Desc : 抽象规则规范
 */
public abstract class AbstractRule<T> {
    /**
     * 规则Id
     */
    @Getter
    @Setter
    private String id;
    /**
     * 规则名称
     */
    @Getter
    @Setter
    private String name;
    /**
     * 规则处理器
     */
    @Getter
    @Setter
    private List<IHandler<RuleBaseEntity>> handlers;

    /**
     * 满足的触发条件
     *
     * @param t
     * @return
     */
    public abstract boolean evaluateConditions(T t);

    public AbstractRule<T> assembly(AbstractRule<T> aRule) {
        Rule annotation = getRuleAnnotation();
        aRule.setId(annotation.id());
        aRule.setName(annotation.name());
        return aRule;
    }

    public AbstractRule<T> addHandler(IHandler<RuleBaseEntity> iHandler) {
        if (Objects.isNull(handlers)) {
            handlers = new ArrayList<>();
            handlers.add(iHandler);
        } else {
            handlers.add(iHandler);
        }
        return this;
    }

    /**
     * 获取规则注解
     *
     * @return
     */
    public abstract Rule getRuleAnnotation();

    public abstract AbstractRule<T> builder();

    /**
     * 规则处理器handler处理事件
     */
    public void performActions() {
        for (IHandler<RuleBaseEntity> handler : handlers) {
            handler.onEvent(EntityContextHolder.getContext());
        }
    }
}
