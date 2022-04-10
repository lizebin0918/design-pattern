package com.lzb.refactor_pratice.lzb;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 单位转换
 * 美国⼈习惯使用很古怪的英制度量单位。英制度量单位的转换经常不是⼗进制的，比如说:
 *
 * 1 英尺(foot) = 12 英寸(inch)
 * 1 码(yard) = 3 英尺(foot)
 * 你的任务是：写一个程序，用于处理英寸、英尺、码之间的转换。
 *
 * 例如：
 *
 * 1 英尺应该等于 12 英寸
 * 1 码应该等于 36 英寸
 * 6 英寸应该等于 1/2 英尺
 */
@Getter
@AllArgsConstructor
public class Length {

    private final double value;
    private final String unit;

    /**
     * 单位转换
     * @param unit
     * @return
     */
    public Length as(String unit) {
        Unit sourceUnit = Unit.of(this.unit);
        Unit targetUnit = Unit.of(unit);
        return new Length(sourceUnit.exchange(this.value, targetUnit), targetUnit.getValue());
    }

}
