package com.lzb.chain;
/**
 * <br/>
 * Created on : 2021-05-07 15:33
 * @author chenpi 
 */
public abstract class Handler {

    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        doHandler();
        if (successor != null) {
            successor.handle();
        }
    }

    public abstract void doHandler();


}
