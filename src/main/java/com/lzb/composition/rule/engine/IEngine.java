package com.lzb.composition.rule.engine;

import com.lzb.composition.rule.model.EngineResult;
import com.lzb.composition.rule.model.TreeRich;
import com.lzb.composition.rule.model.User;

public interface IEngine {

    /**
     * 原版
     * @param treeId
     * @param treeRich
     * @param user
     * @return
     */
    //EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final User user);

    /**
     * 用户命中
     * @param treeId
     * @param treeRich
     * @param user
     * @return
     */
    EngineResult process(final Long treeId, TreeRich treeRich, final User user);

}
