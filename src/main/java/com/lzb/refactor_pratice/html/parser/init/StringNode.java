package com.lzb.refactor_pratice.html.parser.init;

/**
 * <br/>
 * Created on : 2022-05-29 16:47
 *
 * @author lizebin
 */
public class StringNode implements Node {

    protected String textBuffer;

    protected StringNode (String textBuffer) {
        this.textBuffer = textBuffer;
    }

    public static StringNode createStringNode(String textBuffer) {
        return new StringNode(textBuffer);
    }

    @Override
    public String toHtml() {
        return null;
    }

    public String toPlainTextString() {
        return this.textBuffer;
    }

}
