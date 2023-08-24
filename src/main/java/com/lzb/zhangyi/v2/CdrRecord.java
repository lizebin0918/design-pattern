package com.lzb.zhangyi.v2;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * <br/>
 * Created on : 2023-08-24 23:05
 * @author mac
 */
@Getter
@SuperBuilder
public abstract class CdrRecord {

    private String cdrID;

    private String callingNumber;

    private String calledNumber;

    private long callTime;

}
