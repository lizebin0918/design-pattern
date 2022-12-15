package com.lzb.refactoring.simplifying.conditional.expressions;

/**
 * <br/>
 * Created on : 2022-12-15 21:16
 * @author mac
 */
public class ReplaceExceptionWithTest {

	private double[] values = new double[0];

	double getValueForPeriod(int periodNumber) {
		try {
			return values[periodNumber];
		} catch (ArrayIndexOutOfBoundsException e) {
			return 0;
		}
	}

	///////////////////////////////////////////////////////////////////////////
	// 提前判断代替异常
	///////////////////////////////////////////////////////////////////////////

	double getValueForPeriod1(int periodNumber) {
		if (periodNumber >= values.length) {
			return 0;
		}
		return values[periodNumber];
	}

}
