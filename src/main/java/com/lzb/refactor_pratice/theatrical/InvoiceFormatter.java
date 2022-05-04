package com.lzb.refactor_pratice.theatrical;

import java.text.NumberFormat;

public class InvoiceFormatter {

    static String format(NumberFormat format, String customer, int totalAmount, int volumeCredits) {
        var result = String.format("Statement for %s\n", customer);
        result += String.format("Amount owed is %s\n", format.format(totalAmount / 100));
        result += String.format("You earned %s credits\n", volumeCredits);
        return result;
    }
}