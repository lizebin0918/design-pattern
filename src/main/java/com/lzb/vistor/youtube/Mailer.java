package com.lzb.vistor.youtube;

import java.util.function.Consumer;

/**
 * 邮件发送<br/>
 * Created on : 2023-09-07 08:41
 * @author mac
 */
public class Mailer {

    private Mailer() {

    }

    public Mailer from(String addr) {
        System.out.println("from :" + addr);
        return this;
    }

    public Mailer to(String addr) {
        System.out.println("to :" + addr);
        return this;
    }

    public Mailer subject(String subject) {
        System.out.println("subject :" + subject);
        return this;
    }

    public Mailer body(String body) {
        System.out.println("body :" + body);
        return this;
    }

    public static void send(Consumer<Mailer> consumer) {
        var mailer = new Mailer();
        consumer.accept(mailer);
    }

}
