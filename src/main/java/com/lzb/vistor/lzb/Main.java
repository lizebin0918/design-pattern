package com.lzb.vistor.lzb;

import java.util.ArrayList;
import java.util.List;

/**
 * <br/>
 * Created on : 2022-05-17 09:59
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        Word word = new Word();
        Pdf pdf = new Pdf();

        List<Text> texts = new ArrayList<>();
        texts.add(word);
        texts.add(pdf);
        texts.forEach(Text::text);

        List<Zip> zips = new ArrayList<>();
        zips.add(word);
        zips.add(pdf);
        zips.forEach(Zip::zip);
    }

}
