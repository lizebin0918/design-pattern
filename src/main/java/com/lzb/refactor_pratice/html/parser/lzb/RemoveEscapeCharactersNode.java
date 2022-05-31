package com.lzb.refactor_pratice.html.parser.lzb;

import com.lzb.refactor_pratice.html.parser.init.*;

/**
 * <br/>
 * Created on : 2022-05-29 19:14
 *
 * @author lizebin
 */
public class RemoveEscapeCharactersNode implements Node {

    private Node node;

    public RemoveEscapeCharactersNode(Node node) {
        this.node = node;
    }

    @Override
    public String toHtml() {
        return null;
    }

    @Override
    public String toPlainTextString() {
        return ParserUtils.removeEscapeCharacters(node.toPlainTextString());
    }
}
