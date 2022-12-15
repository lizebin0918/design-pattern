package com.lzb.refactoring.simplifying.conditional.expressions;

import java.util.Date;

/**
 * <br/>
 * Created on : 2022-12-15 20:54
 * @author mac
 */
public class DecomposeConditional {

	private static final Date SUMMER_START = new Date();
	private static final Date SUMMER_END = new Date();

	public void test() {
		Date date = new Date();
		if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
			// charge = quantity * winterRate + winterServiceCharge;
		}
		else {
			// charge = quantity * summerRate;
		}
	}

	///////////////////////////////////////////////////////////////////////////
	//
	///////////////////////////////////////////////////////////////////////////

	public void test1() {
		/*if (isSummer(date)) {
			charge = summerCharge(quantity);
		}
		else {
			charge = winterCharge(quantity);
		}*/
	}

}
