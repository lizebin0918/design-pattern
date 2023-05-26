package com.lzb.composition.word;

import lombok.Data;

/**
 * 字体<br/>
 * Created on : 2023-05-26 10:12
 * @author lizebin
 */
@Data
public class Font {

    private int size = 10;

    Font(int size) {
        this.size = size;
    }

}
