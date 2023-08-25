package com.lzb.zhangyi.v2;

/**
 * <br/>
 * Created on : 2023-08-25 10:16
 * @author lizebin
 */
public class Client {

    public static void main(String[] args) {
        String sourceFile = "";
        String targetFile = "";
        CdrTxtServiceV2 cdrTxtServiceV2 = new CdrTxtServiceV2(new CMToCuConverter());
        cdrTxtServiceV2.read(sourceFile);
        cdrTxtServiceV2.write(targetFile);
    }

}
