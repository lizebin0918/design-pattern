package com.lzb.refactoring;

import lombok.Data;

/**
 * <br/>
 * Created on : 2022-12-14 21:59
 * @author mac
 */
public class ReplaceTypeCodeWithClass {

	@Data
	private static class Person {
		public static final int O = 0;
		public static final int A = 1;
		public static final int B = 2;
		public static final int AB = 3;

		private int bloodGroup;

	}

	///////////////////////////////////////////////////////////////////////////
	//
	///////////////////////////////////////////////////////////////////////////

	private static class BloodGroup {

		public static final BloodGroup O = new BloodGroup(0);
		public static final BloodGroup A = new BloodGroup(1);
		public static final BloodGroup B = new BloodGroup(2);
		public static final BloodGroup AB = new BloodGroup(3);

		private int code;

		public BloodGroup(int code) {
			this.code = code;
		}
	}

}
