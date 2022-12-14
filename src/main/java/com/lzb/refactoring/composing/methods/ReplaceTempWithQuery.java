package com.lzb.refactoring.composing.methods;

/**
 * 放大了"basePrice"的作用域<br/>
 * Created on : 2022-07-07 23:46
 *
 * @author lizebin
 */
public class ReplaceTempWithQuery {

    private double quantity, itemPrice;

    double calculateTotal() {
        double basePrice = quantity * itemPrice;
        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // 重构后：扩大了 basePrice 的作用域
    ///////////////////////////////////////////////////////////////////////////

    double calculateTotal1() {
        if (basePrice() > 1000) {
            return basePrice() * 0.95;
        } else {
            return basePrice() * 0.98;
        }
    }

    double calculateTotal2() {
        double basePrice = basePrice();
        double factor = getFactor(basePrice);
        return basePrice * factor;
    }

    private double getFactor(double basePrice) {
        double factor;
        if (basePrice > 1000) {
            factor = 0.95;
        } else {
            factor = 0.98;
        }
        return factor;
    }

    double basePrice() {
        return quantity * itemPrice;
    }

}
