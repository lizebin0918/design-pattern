
package com.lzb.zhangyi.v4;

import com.lzb.zhangyi.v2.CdrRecord;

/**
 * <br/>
 * Created on : 2023-08-24 23:11
 * @author mac
 */
public interface ICdrConverterV4<T> {

    CdrRecord convert(CdrRecord cdrRecord);

    ///////////////////////////////////////////////////////////////////////////
    // 实际是通过字符串转换
    ///////////////////////////////////////////////////////////////////////////

    CdrRecord fromString(T data);

    T toString(CdrRecord cdrRecord);

}
