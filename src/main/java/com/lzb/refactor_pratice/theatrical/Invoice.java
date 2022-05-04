package com.lzb.refactor_pratice.theatrical;

import java.util.List;

public class Invoice {

    public String customer;
    public List<Performance> performances;

    public Invoice(String customer, List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }

    int getVolumeCredits() {
        return performances.stream().mapToInt(Performance::getCredits).sum();
    }

    int getTotalAmount() {
        return performances.stream().mapToInt(Performance::getAmount).sum();
    }
}
