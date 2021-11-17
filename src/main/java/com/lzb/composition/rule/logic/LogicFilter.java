package com.lzb.composition.rule.logic;


import com.lzb.composition.rule.model.TreeNodeLink;
import com.lzb.composition.rule.model.User;

import java.util.List;

public interface LogicFilter {

    /**
     * 逻辑决策器
     *
     * @param matterValue          决策值
     * @param treeNodeLineInfoList 决策节点
     * @return 下一个节点Id
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList);

    /**
     * 获取决策值
     * @param treeId
     * @param user 用户（决策物料(输入)）
     * @return
     */
    String matterValue(Long treeId, User user);

}
