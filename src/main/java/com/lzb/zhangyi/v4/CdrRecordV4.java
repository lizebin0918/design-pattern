package com.lzb.zhangyi.v4;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public abstract class CdrRecordV4 {

    private String cdrID;

    private String callingNumber;

    private String calledNumber;

    private long callTime;

}