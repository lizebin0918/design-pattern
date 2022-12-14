package com.lzb.refactoring;

import lombok.Data;

/**
 * <br/>
 * Created on : 2022-12-14 22:07
 * @author mac
 */
public class ReplaceTypeCodeWithSubclasses {

	@Data
	private static class Employee {
		public static final int ENGINEER = 0;
		public static final int SALESMAN = 1;

		private int type = ENGINEER;
	}

	///////////////////////////////////////////////////////////////////////////
	//
	///////////////////////////////////////////////////////////////////////////

	private static class Engineer extends Employee {

	}

	private static class Salesman extends Employee {

	}

}
