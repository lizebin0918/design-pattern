package com.lzb.memento.v1;

import java.util.Stack;

/**
 * <br/>
 * Created on : 2021-10-13 10:13
 *
 * @author lizebin
 */
public class SnapshotHolder {

    private Stack<InputText> snapshots = new Stack<>();

    public InputText popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(InputText inputText) {
        InputText deepClonedInputText = new InputText();
        deepClonedInputText.setText(inputText.getText());
        snapshots.push(deepClonedInputText);
    }



}
