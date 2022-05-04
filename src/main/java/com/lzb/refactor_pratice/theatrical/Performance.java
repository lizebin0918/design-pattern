package com.lzb.refactor_pratice.theatrical;

public class Performance {

    public Play play;
    /**
     * 观众人数
     */
    public int audience;

    public Performance(Play play, int audience) {
        this.play = play;
        this.audience = audience;
    }

    int getCredits() {
        var thisCredits = Math.max(audience - 30, 0);
        if (isComedy()) thisCredits += Math.floor((double) audience / 5);
        return thisCredits;
    }

    private boolean isComedy() {
        return "comedy".equals(play.type);
    }

    int getAmount() {
        return 40000 + 1000 * Math.max(audience - 30, 0);
    }
}
