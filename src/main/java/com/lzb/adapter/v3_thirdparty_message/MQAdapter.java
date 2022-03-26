package com.lzb.adapter.v3_thirdparty_message;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class MQAdapter {

    public static StandardMessage convert(String strJson, Map<String, String> link) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        return convert(JSON.parseObject(strJson, Map.class), link);
    }
		
    // 根据映射转换字段
    public static StandardMessage convert(Map obj, Map<String, String> link) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        StandardMessage message = new StandardMessage();
        for (Map.Entry<String, String> entry : link.entrySet()) {
            Object val = obj.get(entry.getValue());
            String methodName = "set" + entry.getKey().substring(0, 1).toUpperCase() + entry.getKey().substring(1);
            StandardMessage.class.getMethod(methodName, String.class).invoke(message, val.toString());
        }
        return message;
    }

}
