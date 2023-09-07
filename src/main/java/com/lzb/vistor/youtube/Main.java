package com.lzb.vistor.youtube;

/**
 * <br/>
 * Created on : 2023-09-07 08:44
 * @author mac
 */
public class Main {

    public static void main(String[] args) {
        Mailer.send(mailer -> {
            mailer.from("fromAddr")
                    .to("toAddr")
                    .body("hello world")
                    .subject("this is a test");
        });
    }

}
