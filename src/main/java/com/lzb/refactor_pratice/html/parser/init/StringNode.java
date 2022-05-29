package com.lzb.refactor_pratice.html.parser.init;

/**
 * <br/>
 * Created on : 2022-05-29 16:47
 *
 * @author lizebin
 */
public class StringNode implements Node {

    private boolean shouldDecode;
    private boolean shouldRemoveEscapeCharacters;
    private StringBuffer textBuffer;

    private StringNode(
        StringBuffer textBuffer,
        int textBegin,
        int textEnd,
        boolean shouldDecode,
        boolean shouldRemoveEscapeCharacters
    ) {
        this.textBuffer = textBuffer;
        this.shouldDecode = shouldDecode;
        this.shouldRemoveEscapeCharacters = shouldRemoveEscapeCharacters;
    }

    public static StringNode createStringNode(
        StringBuffer textBuffer,
        int textBegin,
        int textEnd,
        boolean shouldDecode,
        boolean shouldRemoveEscapeCharacters
    ) {
        return new StringNode(textBuffer, textBegin, textEnd, shouldDecode, shouldRemoveEscapeCharacters);
    }

    @Override
    public String toHtml() {
        return null;
    }

    public String toPlainTextString() {
        var result = this.textBuffer.toString();

        if (this.shouldDecode) {
            result = Translate.decode(result);
        }

        if (this.shouldRemoveEscapeCharacters) {
            result = ParserUtils.removeEscapeCharacters(result);
        }
        return result;
    }

}
