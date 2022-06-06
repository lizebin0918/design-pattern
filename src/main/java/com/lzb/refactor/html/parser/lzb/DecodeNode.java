package com.lzb.refactor.html.parser.lzb;

import com.lzb.refactor.html.parser.init.*;

/**
 * <br/>
 * Created on : 2022-05-29 19:11
 *
 * @author lizebin
 */
public class DecodeNode implements Node {

    private Node node;

    public DecodeNode(Node node) {
        this.node = node;
    }


    @Override
    public String toHtml() {
        return null;
    }

    @Override
    public String toPlainTextString() {
        return Translate.decode(node.toPlainTextString());
    }
}
