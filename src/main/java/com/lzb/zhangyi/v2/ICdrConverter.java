package com.lzb.zhangyi.v2;

/**
 * <br/>
 * Created on : 2023-08-24 23:11
 * @author mac
 */
public interface ICdrConverter {

    CdrRecord convert(CdrRecord cdrRecord);

    ///////////////////////////////////////////////////////////////////////////
    // 实际是通过字符串转换
    ///////////////////////////////////////////////////////////////////////////

    CdrRecord fromString(String recordLine);

    String toString(CdrRecord cdrRecord);

}
