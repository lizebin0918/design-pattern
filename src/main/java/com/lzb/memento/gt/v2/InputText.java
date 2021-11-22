package com.lzb.memento.gt.v2;

/**
 * <br/>
 * Created on : 2021-10-13 22:05
 *
 * @author lizebin
 */
public class InputText {

    private StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String input) {
        text.append(input);
    }

    public Snapshot createSnapshot() {
        return new Snapshot(text.toString());
    }

    public void restoreSnapshot(Snapshot snapshot) {
        this.text.replace(0, this.text.length(), snapshot.getText());
    }

}
