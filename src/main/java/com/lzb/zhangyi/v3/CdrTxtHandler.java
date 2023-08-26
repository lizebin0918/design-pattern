package com.lzb.zhangyi.v3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.lzb.zhangyi.v2.ICdrConverter;

/**
 * <br/>
 * Created on : 2023-08-26 17:13
 * @author mac
 */
public class CdrTxtHandler extends CdrHandler {

    private final String sourceFileName;
    private final String targetFileName;

    CdrTxtHandler(ICdrConverter converter, String sourceFileName, String targetFileName) {
        super(converter);
        this.sourceFileName = sourceFileName;
        this.targetFileName = targetFileName;
    }

    @Override
    protected void read() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(sourceFileName));
            for (String line : lines) {
                records.add(converter.convert(converter.fromString(line)));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void write() {

    }
}
