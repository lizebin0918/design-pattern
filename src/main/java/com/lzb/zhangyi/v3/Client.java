package com.lzb.zhangyi.v3;

import com.lzb.zhangyi.v2.CMToCuConverter;
import com.lzb.zhangyi.v2.CdrTxtServiceV2;

/**
 * <br/>
 * Created on : 2023-08-25 10:16
 * @author lizebin
 */
public class Client {

    public static void main(String[] args) {
        String sourceFile = "";
        String targetFile = "";
        CdrTxtHandler cdrTxtHandler = new CdrTxtHandler(new CMToCuConverter(), sourceFile, targetFile);
        cdrTxtHandler.handler();
    }

}
