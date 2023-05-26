package com.lzb.composition.word;

import java.util.ArrayList;
import java.util.List;

/**
 * <br/>
 * Created on : 2023-05-26 10:15
 * @author lizebin
 */
public abstract class CompositeElement implements Element {

    protected List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public void changeFont(Font font) {
        elements.forEach(element -> element.changeFont(font));
    }

    @Override
    public void show() {
        elements.forEach(Element::show);
    }
}
