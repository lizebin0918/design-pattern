package com.lzb.memento.v2;

/**
 * <br/>
 * Created on : 2021-10-13 22:06
 *
 * @author lizebin
 */
public class Snapshot {

    private String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

}
