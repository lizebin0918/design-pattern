package com.lzb.vistor.lzb;

/**
 * <br/>
 * Created on : 2022-05-17 09:58
 *
 * @author lizebin
 */
public class Pdf implements Text, Zip {

    public String text() {
        System.out.println("this is pdf text");
        return "pdf";
    }

    @Override
    public String zip() {
        System.out.println("pdf zip");
        return "pdf zip";
    }
}
