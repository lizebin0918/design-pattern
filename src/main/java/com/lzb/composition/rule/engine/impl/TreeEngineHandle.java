package com.lzb.composition.rule.engine.impl;

import com.lzb.composition.rule.engine.EngineBase;
import com.lzb.composition.rule.model.EngineResult;
import com.lzb.composition.rule.model.tree.TreeNode;
import com.lzb.composition.rule.model.tree.Tree;
import com.lzb.composition.rule.model.User;

public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(final Long treeId, Tree tree, final User user) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(tree, treeId, user);
        // 决策结果
        return new EngineResult(user.getId(), treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}
