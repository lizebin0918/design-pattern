package com.lzb.validation_1;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;

@Component
public class UserLevelValidator extends Validator<UserParam> {
 
    @Override
    public void validate(UserParam param) {
        System.out.println("验证等级");
        if (param == null) {
            throw new BusinessException("");
        }
        // 模拟服务，根据userId查询等级
        boolean isBiggerThan50 = RandomUtils.nextBoolean();
        if (!isBiggerThan50) {
            throw new BusinessException("低于50级");
        }
    }
}