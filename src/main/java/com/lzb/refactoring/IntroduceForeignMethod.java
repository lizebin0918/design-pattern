package com.lzb.refactoring;

import java.util.Date;

/**
 * <br/>
 * Created on : 2022-07-08 09:56
 *
 * @author lizebin
 */
public class IntroduceForeignMethod {

    private static Date previousEnd;

    static class Report {

        // ...
        void sendReport() {
            Date nextDay = new Date(previousEnd.getYear(),
                    previousEnd.getMonth(), previousEnd.getDate() + 1);
            // ...
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    ///////////////////////////////////////////////////////////////////////////

    static class Report1 {
        // ...
        void sendReport() {
            Date newStart = nextDay(previousEnd);
            // ...
        }
        private static Date nextDay(Date arg) {
            return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
        }
    }

}
