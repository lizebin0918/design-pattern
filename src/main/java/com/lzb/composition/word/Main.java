package com.lzb.composition.word;

/**
 * <br/>
 * Created on : 2023-05-26 10:24
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        Document document = new Document();

        Word w1 = new Word("word");
        document.add(w1);

        Paragraph p1 = new Paragraph();
        Word word1 = new Word("word1");
        p1.add(w1);
        p1.add(word1);
        document.add(p1);

        document.show();
    }

}
