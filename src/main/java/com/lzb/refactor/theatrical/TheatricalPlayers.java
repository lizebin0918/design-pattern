package com.lzb.refactor.theatrical;

import java.text.NumberFormat;
import java.util.Locale;

public class TheatricalPlayers {

    public String print(Invoice invoice) {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        return InvoiceFormatter.format(format, invoice.customer, invoice.getTotalAmount(), invoice.getVolumeCredits());
    }

}
