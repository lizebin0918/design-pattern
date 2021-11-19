package com.lzb.composition.rule;

import com.alibaba.fastjson.JSON;
import com.lzb.composition.rule.engine.IEngine;
import com.lzb.composition.rule.engine.impl.TreeEngineHandle;
import com.lzb.composition.rule.model.*;
import com.lzb.composition.rule.model.tree.Tree;
import com.lzb.composition.rule.model.tree.TreeNode;
import com.lzb.composition.rule.model.tree.TreeNodeLink;
import com.lzb.composition.rule.model.tree.TreeRoot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <br/>
 * Created on : 2021-11-17 20:16
 *
 * @author lizebin
 */
public class Main {

    private static Tree tree;

    public static void main(String[] args) {

        init();

        System.out.println("决策树组合结构信息：\r\n" + JSON.toJSONString(tree));

        IEngine treeEngineHandle = new TreeEngineHandle();

        User user = new User();
        user.setId("1234567");
        user.setGender("man");
        user.setAge(32);

        EngineResult result = treeEngineHandle.process(10001L, tree, user);
        System.out.printf("测试结果 ：%s", JSON.toJSONString(result));

    }

    public static void init() {

        // 节点：1
        TreeNode treeNode_01 = new TreeNode();
        treeNode_01.setTreeId(10001L);
        treeNode_01.setTreeNodeId(1L);
        treeNode_01.setNodeType(1);
        treeNode_01.setNodeValue(null);
        treeNode_01.setRuleKey("userGender");
        treeNode_01.setRuleDesc("用户性别[男/女]");

        // 链接：1->11
        TreeNodeLink treeNodeLink_11 = new TreeNodeLink();
        treeNodeLink_11.setNodeIdFrom(1L);
        treeNodeLink_11.setNodeIdTo(11L);
        treeNodeLink_11.setRuleLimitType(1);
        treeNodeLink_11.setRuleLimitValue("man");

        // 链接：1->12
        TreeNodeLink treeNodeLink_12 = new TreeNodeLink();
        treeNodeLink_12.setNodeIdFrom(1L);
        treeNodeLink_12.setNodeIdTo(12L);
        treeNodeLink_12.setRuleLimitType(1);
        treeNodeLink_12.setRuleLimitValue("woman");

        List<TreeNodeLink> treeNodeLinkList_1 = new ArrayList<>();
        treeNodeLinkList_1.add(treeNodeLink_11);
        treeNodeLinkList_1.add(treeNodeLink_12);

        treeNode_01.setTreeNodeLinkList(treeNodeLinkList_1);

        // 节点：11
        TreeNode treeNode_11 = new TreeNode();
        treeNode_11.setTreeId(10001L);
        treeNode_11.setTreeNodeId(11L);
        treeNode_11.setNodeType(1);
        treeNode_11.setNodeValue(null);
        treeNode_11.setRuleKey("userAge");
        treeNode_11.setRuleDesc("用户年龄");

        // 年龄小于25岁
        // 链接：11->111
        TreeNodeLink treeNodeLink_111 = new TreeNodeLink();
        treeNodeLink_111.setNodeIdFrom(11L);
        treeNodeLink_111.setNodeIdTo(111L);
        treeNodeLink_111.setRuleLimitType(3);
        treeNodeLink_111.setRuleLimitValue("25");

        // 年龄大于25岁
        // 链接：11->112
        TreeNodeLink treeNodeLink_112 = new TreeNodeLink();
        treeNodeLink_112.setNodeIdFrom(11L);
        treeNodeLink_112.setNodeIdTo(112L);
        treeNodeLink_112.setRuleLimitType(3);
        treeNodeLink_112.setRuleLimitValue("30");

        // 年龄大于30岁
        // 链接：11->113
        TreeNodeLink treeNodeLink_113 = new TreeNodeLink();
        treeNodeLink_113.setNodeIdFrom(11L);
        treeNodeLink_113.setNodeIdTo(113L);
        treeNodeLink_113.setRuleLimitType(3);
        treeNodeLink_113.setRuleLimitValue("35");

        // 年龄大于35岁
        // 链接：11->114
        TreeNodeLink treeNodeLink_114 = new TreeNodeLink();
        treeNodeLink_114.setNodeIdFrom(11L);
        treeNodeLink_114.setNodeIdTo(114L);
        treeNodeLink_114.setRuleLimitType(3);
        treeNodeLink_114.setRuleLimitValue("40");

        List<TreeNodeLink> treeNodeLinkList_11 = new ArrayList<>();
        treeNodeLinkList_11.add(treeNodeLink_111);
        treeNodeLinkList_11.add(treeNodeLink_112);
        treeNodeLinkList_11.add(treeNodeLink_113);
        treeNodeLinkList_11.add(treeNodeLink_114);

        treeNode_11.setTreeNodeLinkList(treeNodeLinkList_11);

        // 节点：12
        TreeNode treeNode_12 = new TreeNode();
        treeNode_12.setTreeId(10001L);
        treeNode_12.setTreeNodeId(12L);
        treeNode_12.setNodeType(1);
        treeNode_12.setNodeValue(null);
        treeNode_12.setRuleKey("userAge");
        treeNode_12.setRuleDesc("用户年龄");

        // 链接：12->121
        TreeNodeLink treeNodeLink_121 = new TreeNodeLink();
        treeNodeLink_121.setNodeIdFrom(12L);
        treeNodeLink_121.setNodeIdTo(121L);
        // 小于25岁
        treeNodeLink_121.setRuleLimitType(3);
        treeNodeLink_121.setRuleLimitValue("25");

        // 链接：12->122
        TreeNodeLink treeNodeLink_122 = new TreeNodeLink();
        treeNodeLink_122.setNodeIdFrom(12L);
        treeNodeLink_122.setNodeIdTo(122L);
        // 小于30岁
        treeNodeLink_122.setRuleLimitType(3);
        treeNodeLink_122.setRuleLimitValue("30");

        // 年龄小于35岁
        // 链接：12->123
        TreeNodeLink treeNodeLink_123 = new TreeNodeLink();
        treeNodeLink_123.setNodeIdFrom(12L);
        treeNodeLink_123.setNodeIdTo(123L);
        treeNodeLink_123.setRuleLimitType(3);
        treeNodeLink_123.setRuleLimitValue("35");

        // 年龄小于40岁
        // 链接：12->124
        TreeNodeLink treeNodeLink_124 = new TreeNodeLink();
        treeNodeLink_124.setNodeIdFrom(12L);
        treeNodeLink_124.setNodeIdTo(124L);
        treeNodeLink_124.setRuleLimitType(4);
        treeNodeLink_124.setRuleLimitValue("40");

        List<TreeNodeLink> treeNodeLinkList_12 = new ArrayList<>();
        treeNodeLinkList_12.add(treeNodeLink_121);
        treeNodeLinkList_12.add(treeNodeLink_122);
        treeNodeLinkList_12.add(treeNodeLink_123);
        treeNodeLinkList_12.add(treeNodeLink_124);

        treeNode_12.setTreeNodeLinkList(treeNodeLinkList_12);

        // 节点：111
        TreeNode treeNode_111 = new TreeNode();
        treeNode_111.setTreeId(10001L);
        treeNode_111.setTreeNodeId(111L);
        treeNode_111.setNodeType(2);
        treeNode_111.setNodeValue("运营活动A");

        // 节点：112
        TreeNode treeNode_112 = new TreeNode();
        treeNode_112.setTreeId(10001L);
        treeNode_112.setTreeNodeId(112L);
        treeNode_112.setNodeType(2);
        treeNode_112.setNodeValue("运营活动B");

        /*
        节点:113
         */
        TreeNode treeNode_113 = new TreeNode();
        treeNode_113.setTreeId(10001L);
        treeNode_113.setTreeNodeId(113L);
        treeNode_113.setNodeType(2);
        treeNode_113.setNodeValue("运营活动C");

        /*
        节点:114
         */
        TreeNode treeNode_114 = new TreeNode();
        treeNode_114.setTreeId(10001L);
        treeNode_114.setTreeNodeId(114L);
        treeNode_114.setNodeType(2);
        treeNode_114.setNodeValue("运营活动D");

        // 节点：121
        TreeNode treeNode_121 = new TreeNode();
        treeNode_121.setTreeId(10001L);
        treeNode_121.setTreeNodeId(121L);
        treeNode_121.setNodeType(2);
        treeNode_121.setNodeValue("运营活动E");

        // 节点：122
        TreeNode treeNode_122 = new TreeNode();
        treeNode_122.setTreeId(10001L);
        treeNode_122.setTreeNodeId(122L);
        treeNode_122.setNodeType(2);
        treeNode_122.setNodeValue("运营活动F");

        // 节点：121
        TreeNode treeNode_123 = new TreeNode();
        treeNode_123.setTreeId(10001L);
        treeNode_123.setTreeNodeId(123L);
        treeNode_123.setNodeType(2);
        treeNode_123.setNodeValue("运营活动G");

        // 节点：122
        TreeNode treeNode_124 = new TreeNode();
        treeNode_124.setTreeId(10001L);
        treeNode_124.setTreeNodeId(124L);
        treeNode_124.setNodeType(2);
        treeNode_124.setNodeValue("运营活动H");

        // 树根
        TreeRoot treeRoot = new TreeRoot();
        treeRoot.setTreeId(10001L);
        treeRoot.setTreeRootNodeId(1L);
        treeRoot.setTreeName("规则决策树");

        Map<Long, TreeNode> treeNodeMap = new HashMap<>();
        treeNodeMap.put(1L, treeNode_01);
        treeNodeMap.put(11L, treeNode_11);
        treeNodeMap.put(12L, treeNode_12);
        treeNodeMap.put(111L, treeNode_111);
        treeNodeMap.put(112L, treeNode_112);
        treeNodeMap.put(113L, treeNode_113);
        treeNodeMap.put(114L, treeNode_114);
        treeNodeMap.put(121L, treeNode_121);
        treeNodeMap.put(122L, treeNode_122);
        treeNodeMap.put(123L, treeNode_123);
        treeNodeMap.put(124L, treeNode_124);

        tree = new Tree(treeRoot, treeNodeMap);

    }
}
