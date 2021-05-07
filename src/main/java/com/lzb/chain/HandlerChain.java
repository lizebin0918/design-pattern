package com.lzb.chain;
/**
 * 处理链<br/>
 * Created on : 2021-05-07 15:38
 * @author chenpi 
 */
public class HandlerChain {

    private Handler head, tail;

    public synchronized void add(Handler handler) {
        if (head == null && tail == null) {
            head = tail = handler;
        } else {
            tail.setSuccessor(handler);
            tail = handler;
        }
    }

    public void handler() {
        if (head != null) {
            head.handler();
        }
    }

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.add(new HandlerA());
        chain.add(new HandlerB());
        chain.handler();
    }

}
