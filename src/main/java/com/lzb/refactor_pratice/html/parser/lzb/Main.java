package com.lzb.refactor_pratice.html.parser.lzb;

import com.lzb.refactor_pratice.html.parser.init.Node;
import com.lzb.refactor_pratice.html.parser.init.StringNode;

/**
 * <br/>
 * Created on : 2022-05-29 19:27
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        Node node = new DecodeNode(new RemoveEscapeCharactersNode(StringNode.createStringNode("lizebin")));
        System.out.println(node.toPlainTextString());
    }

}
