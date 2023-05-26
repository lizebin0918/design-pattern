package com.lzb.composition.html;

/**
 * <br/>
 * Created on : 2023-05-26 19:29
 * @author lizebin
 */
public class Main {
    public static void main(String[] args) {
        MyHtmlControl myHtmlControl = new MyHtmlControl();
        myHtmlControl.createControls();
        myHtmlControl.render("render");

        MyHtmlControl myHtmlControl1 = new MyHtmlControl();
        myHtmlControl1.render("renderControl");

        myHtmlControl.getChildren().add(myHtmlControl1);

        myHtmlControl.show();

    }


}
