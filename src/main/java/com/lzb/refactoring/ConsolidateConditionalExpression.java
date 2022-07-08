package com.lzb.refactoring;

/**
 * 合并条件<br/>
 * Created on : 2022-07-08 23:27
 *
 * @author lizebin
 */
public class ConsolidateConditionalExpression {

    private double seniority, monthsDisabled;
    private boolean isPartTime;

    double disabilityAmount() {
        if (seniority < 2) {
            return 0;
        }
        if (monthsDisabled > 12) {
            return 0;
        }
        if (isPartTime) {
            return 0;
        }
        return 0;
    }

    double disabilityAmount1() {
        if (isNotEligibleForDisability()) {
            return 0;
        }
        return 0;
    }

    private boolean isNotEligibleForDisability() {
        return false;
    }


}
