package com.lzb.validation_1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.RandomUtils;

import org.springframework.stereotype.Component;

/**
 * 特殊情况才校验
 */
@Component
public class UserSomeValidator extends Validator<UserParam> {
 
    @PostConstruct
    public void init() {
        setGroups(Stream.of(UserValidateGroupEnum.SOME).collect(Collectors.toSet()));
    }
 
    @Override
    void validate(UserParam param) {
        System.out.println("仅检测Some类型的");
        if (param == null) {
            throw new BusinessException("");
        }
        // 模拟服务，根据userId某个条件
        boolean isSome = RandomUtils.nextBoolean();
        if (!isSome) {
            throw new BusinessException("某种条件不满足哦！");
        }
    }
}