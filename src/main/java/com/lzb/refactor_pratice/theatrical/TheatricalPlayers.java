package com.lzb.refactor_pratice.theatrical;

import java.text.NumberFormat;
import java.util.Locale;

public class TheatricalPlayers {

    public String print(Invoice invoice) {

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);

        var totalAmount = invoice.performances.stream().mapToInt(Performance::getAmount).sum();
        var volumeCredits = invoice.performances.stream().mapToInt(Performance::getCredits).sum();

        return getResult(invoice, format, totalAmount, volumeCredits);
    }

    private String getResult(Invoice invoice, NumberFormat format, int totalAmount, int volumeCredits) {
        var result = String.format("Statement for %s\n", invoice.customer);
        result += String.format("Amount owed is %s\n", format.format(totalAmount / 100));
        result += String.format("You earned %s credits\n", volumeCredits);
        return result;
    }

}
