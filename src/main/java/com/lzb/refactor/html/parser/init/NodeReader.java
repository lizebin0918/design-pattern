package com.lzb.refactor.html.parser.init;

import lombok.Getter;

public class NodeReader {

    @Getter
    private Parser parser;

    public NodeReader() {
        this.parser = new Parser();
    }
}
