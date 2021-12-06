package com.lzb.memento.gt.v1;

/**
 * 备忘录模式<br/>
 * Created on : 2021-10-13 10:02
 *
 * @author lizebin
 */
public class InputText {

    private final StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String input) {
        text.append(input);
    }

    public void setText(String text) {
        // 相当于把原字符串清空，替换成新的字符串
        this.text.replace(0, this.text.length(), text);
    }

    @Override
    public String toString() {
        return this.text.toString();
    }

}
