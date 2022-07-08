package com.lzb.refactoring;

/**
 * 卫语句<br/>
 * Created on : 2022-07-08 23:35
 *
 * @author lizebin
 */
public class ReplaceNestedConditionalWithGuardClauses {

    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;

    public double getPayAmount() {
        double result;
        if (isDead){
            result = deadAmount();
        }
        else {
            if (isSeparated){
                result = separatedAmount();
            }
            else {
                if (isRetired){
                    result = retiredAmount();
                }
                else{
                    result = normalPayAmount();
                }
            }
        }
        return result;
    }

    private double normalPayAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double separatedAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    ///////////////////////////////////////////////////////////////////////////

    public double getPayAmount1() {
        if (isDead){
            return deadAmount();
        }
        if (isSeparated){
            return separatedAmount();
        }
        if (isRetired){
            return retiredAmount();
        }
        return normalPayAmount();
    }

}
