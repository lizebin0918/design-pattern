package com.lzb.refactor_pratice.theatrical;

import java.text.NumberFormat;
import java.util.List;

public class Invoice {

    public String customer;
    public List<Performance> performances;

    public Invoice(String customer, List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }

    String format(NumberFormat format, int totalAmount, int volumeCredits) {
        var result = String.format("Statement for %s\n", customer);
        result += String.format("Amount owed is %s\n", format.format(totalAmount / 100));
        result += String.format("You earned %s credits\n", volumeCredits);
        return result;
    }
}
