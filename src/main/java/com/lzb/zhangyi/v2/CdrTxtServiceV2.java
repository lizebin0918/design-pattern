package com.lzb.zhangyi.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.lzb.zhangyi.CUCdr;

/**
 * <br/>
 * Created on : 2023-08-24 22:57
 * @author mac
 */
public class CdrTxtServiceV2 {

    private final ICdrConverter converter;
    private final List<CdrRecord> records = new ArrayList<>();

    public CdrTxtServiceV2(ICdrConverter converter) {
        this.converter = converter;
    }

    /**
     * 读取
     * @param sourceFileName
     * @return
     */
    public void read(String sourceFileName) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(sourceFileName));
            for (String line : lines) {
                records.add(converter.convert(converter.fromString(line)));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 无法重载，要不就起个别的名字
     * @param sourceFileName
     * @return
     */
    /*public static final List<CMCdr> read(String sourceFileName) {
        return null;
    }*/

    /**
     * 写入
     * @param targetFileName
     */
    public static final void write(String targetFileName) {

    }

}
