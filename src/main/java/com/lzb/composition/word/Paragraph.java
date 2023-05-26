package com.lzb.composition.word;

/**
 * <br/>
 * Created on : 2023-05-26 10:19
 * @author lizebin
 */
public class Paragraph extends CompositeElement {

    @Override
    public void add(Element element) {
        if (element instanceof Document) {
            throw new IllegalArgumentException("不能为document");
        }
        super.add(element);
    }

    @Override
    public void show() {
        System.out.println("paragraph----------");
        super.show();
        System.out.println("paragraph----------");
    }
}
