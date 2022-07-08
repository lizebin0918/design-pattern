package com.lzb.refactoring;

import java.util.Date;

/**
 * <br/>
 * Created on : 2022-07-08 23:13
 *
 * @author lizebin
 */
public class DecomposeConditional {

    private static final Date SUMMER_START = new Date();
    private static final Date SUMMER_END = new Date();

    public static void main(String[] args) {

        Date date = new Date();
        double charge = 0;
        double quantity = 1, winterRate = 1, winterServiceCharge = 1;
        double summerRate = 1;

        if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
            charge = quantity * winterRate + winterServiceCharge;
        }
        else {
            charge = quantity * summerRate;
        }

        System.out.println(charge);

        ///////////////////////////////////////////////////////////////////////////
        // 重构后
        ///////////////////////////////////////////////////////////////////////////

        if (isSummer(date)) {
            charge = summerCharge(quantity);
        }
        else {
            charge = winterCharge(quantity);
        }

    }

    private static double winterCharge(double quantity) {
        return 0;
    }

    private static double summerCharge(double quantity) {
        return 0;
    }

    private static boolean isSummer(Date date) {
        return false;
    }

}
