package com.lzb.composition.html;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <br/>
 * Created on : 2023-05-26 17:47
 * @author lizebin
 */
public class Controls implements Iterable<Control> {

    protected final Control owner;
    private List<Control> list = new ArrayList<>();

    public Controls(Control owner) {
        this.owner = owner;
    }

    void add(Control control) {
        list.add(control);
    }

    void remove(Control control) {
        list.remove(control);
    }

    @Override
    public Iterator<Control> iterator() {
        return list.iterator();
    }

}
