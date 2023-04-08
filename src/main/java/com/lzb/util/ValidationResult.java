package com.lzb.util;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import lombok.Builder;
import lombok.Getter;

/**
 * 校验结果<br/>
 * Created on : 2023-04-08 10:26
 * @author lizebin
 */
@Getter
@Builder
public class ValidationResult {

    private boolean validate = true;

    @Builder.Default
    private final List<String> errorMsgs = new ArrayList<>();

    public void addErrorMsg(String errorMsg) {
        errorMsgs.add(errorMsg);
    }

    public static void main(String[] args) {
        ValidationResult validationResult = ValidationResult.builder().validate(false).build();
        validationResult.addErrorMsg("错误信息1");
        validationResult.addErrorMsg("错误信息2");
        System.out.println(JSON.toJSONString(validationResult));
    }

}
