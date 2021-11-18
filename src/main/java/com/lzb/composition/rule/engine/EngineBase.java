package com.lzb.composition.rule.engine;


import com.lzb.composition.rule.logic.LogicFilter;
import com.lzb.composition.rule.model.*;

import java.util.Map;

public abstract class EngineBase extends EngineConfig implements IEngine {

    @Override
    public abstract EngineResult process(final Long treeId, TreeRich treeRich, final User user);

    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, User user) {
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        // 规则树根ID
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);
        //节点类型[NodeType]；1子叶、2果实
        while (treeNodeInfo.getNodeType().equals(1)) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, user);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
            if (nextNode == 0) {
                System.out.println("无匹配规则，应该走兜底规则");
                break;
            }
            treeNodeInfo = treeNodeMap.get(nextNode);
            System.out.printf("决策树引擎=>%s userId：%s treeId：%s treeNode：%s ruleKey：%s matterValue：%s", treeRoot.getTreeName(),
                    user.getId(), treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
            System.out.println("");
        }
        return treeNodeInfo;
    }

}
