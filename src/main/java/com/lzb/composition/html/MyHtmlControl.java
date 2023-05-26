package com.lzb.composition.html;

/**
 * <br/>
 * Created on : 2023-05-26 19:32
 * @author lizebin
 */
public class MyHtmlControl extends HtmlContainerControl {

    public void show() {
        System.out.println("parent:" + data);
        children.forEach(item -> System.out.println(item.getData()));
    }

}
