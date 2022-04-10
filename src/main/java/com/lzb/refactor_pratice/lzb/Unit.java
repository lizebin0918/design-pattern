package com.lzb.refactor_pratice.lzb;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

/**
 * 单位
 */
@Getter
@AllArgsConstructor
public enum Unit implements Exchange {

    /**
     * 英尺
     */
    FOOT("f") {
        @Override
        public double exchange(double value, Unit unit) {
            if (YARD == unit) {
                return value / 3;
            } else if (INCH == unit) {
                return value * 12;
            }
            return value;
        }
    },

    /**
     * 英寸
     */
    INCH("inch") {
        @Override
        public double exchange(double value, Unit unit) {
            if (unit == FOOT) {
                return value / 12;
            } else if (YARD == unit) {
                return value / 36;
            }
            return value;
        }
    },

    /**
     * 码
     */
    YARD("yard") {
        @Override
        public double exchange(double value, Unit unit) {
            if (INCH == unit) {
                return value * 36;
            } else if (unit == FOOT){
                return value * 3;
            }
            return value;
        }
    };

    private String value;

    public static Unit of(String unit) {
        return Stream.of(Unit.values()).filter(item -> item.getValue().equals(unit)).findFirst().get();
    }
}