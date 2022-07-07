package com.lzb.refactoring;

/**
 * 提取变量<br/>
 * Created on : 2022-07-07 23:24
 *
 * @author lizebin
 */
public class ExtractVariable {

    private String platform;
    private String browser;
    private int resize;

    void renderBanner() {
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
            (browser.toUpperCase().indexOf("IE") > -1) &&
            wasInitialized() && resize > 0 )
        {
            // do something
        }
    }

    private boolean wasInitialized() {
        return false;
    }

    ///////////////////////////////////////////////////////////////////////////
    // 重构后
    ///////////////////////////////////////////////////////////////////////////

    void renderBanner1() {
        final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean isIE = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResized = resize > 0;

        if (isMacOs && isIE && wasInitialized() && wasResized) {
            // do something
        }
    }

}
