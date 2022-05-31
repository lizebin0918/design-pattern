package com.lzb.refactor_pratice.html.parser.init;

import lombok.Data;

@Data
public class Parser {
    private boolean _shouldDecodeNodes = false;
    private boolean _shouldRemoveEscapeCharacters = false;
}
