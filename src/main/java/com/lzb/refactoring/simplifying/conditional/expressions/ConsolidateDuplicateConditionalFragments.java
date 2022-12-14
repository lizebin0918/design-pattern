package com.lzb.refactoring.simplifying.conditional.expressions;

/**
 * <br/>
 * Created on : 2022-12-14 22:24
 * @author mac
 */
public class ConsolidateDuplicateConditionalFragments {

	public void t() {
		double total = 0, price = 1;
		if (isSpecialDeal()) {
			total = price * 0.95;
			send();
		}
		else {
			total = price * 0.98;
			send();
		}
	}

	private boolean isSpecialDeal() {
		return false;
	}

	private void send() {
	}

	///////////////////////////////////////////////////////////////////////////
	//
	///////////////////////////////////////////////////////////////////////////

	public void t1() {
		double total = 0, price = 1;
		if (isSpecialDeal()) {
			total = price * 0.95;
		}
		else {
			total = price * 0.98;
		}
		send();
	}

}
