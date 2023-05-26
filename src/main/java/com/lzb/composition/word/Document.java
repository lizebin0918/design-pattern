package com.lzb.composition.word;

/**
 * <br/>
 * Created on : 2023-05-26 10:20
 * @author lizebin
 */
public class Document extends CompositeElement {

    @Override
    public void add(Element element) {
        if (element instanceof Document) {
            super.add(element);
        }
        if (element instanceof Word) {
            // 这是为啥？
            Paragraph paragraph = new Paragraph();
            paragraph.add(element);
            super.add(paragraph);
        } else {
            super.add(element);
        }
    }


}
