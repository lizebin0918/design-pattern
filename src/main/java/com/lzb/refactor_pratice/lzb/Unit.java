package com.lzb.refactor_pratice.lzb;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 单位
 */
@Getter
@AllArgsConstructor
public enum Unit implements Exchange {

    /**
     * 英尺
     */
    FOOT {
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
    INCH {
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
    YARD {
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

}