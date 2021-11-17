package com.lzb.composition.rule.engine.impl;

import com.lzb.composition.rule.engine.EngineBase;
import com.lzb.composition.rule.model.EngineResult;
import com.lzb.composition.rule.model.TreeNode;
import com.lzb.composition.rule.model.TreeRich;
import com.lzb.composition.rule.model.User;

public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(final Long treeId, TreeRich treeRich, final User user) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, user);
        // 决策结果
        return new EngineResult(user.getId(), treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}
