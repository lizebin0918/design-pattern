package com.lzb.composition.rule.logic.impl;

import com.lzb.composition.rule.logic.BaseLogic;
import com.lzb.composition.rule.model.User;

public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, User user) {
        return user.getGender();
    }

}
