package com.lzb.zhangyi.v4;

public class ClientV4 {

    public static void main(String[] args) {
        CdrHandlerV4 cdrHandlerV4 = new CdrXmlNodeHandler(new CUToCMConverterXmlNode());
        cdrHandlerV4.handler();
    }

}