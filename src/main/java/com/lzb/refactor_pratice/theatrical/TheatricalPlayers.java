package com.lzb.refactor_pratice.theatrical;

import java.text.NumberFormat;
import java.util.Locale;

public class TheatricalPlayers {

    public String print(Invoice invoice) {

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);

        var totalAmount = invoice.performances.stream().mapToInt(Performance::getAmount).sum();
        var volumeCredits = invoice.performances.stream().mapToInt(Performance::getCredits).sum();

        return InvoiceFormatter.format(format, invoice.customer, totalAmount, volumeCredits);
    }

}
