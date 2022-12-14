package com.lzb.refactoring;

/**
 * 替换数组对象<br/>
 * Created on : 2022-12-14 21:44
 * @author mac
 */
public class ReplaceArrayWithObject {

	public void person() {
		String[] row = new String[2];
		row[0] = "lizebin";
		row[1] = "18";
	}

	///////////////////////////////////////////////////////////////////////////
	//
	///////////////////////////////////////////////////////////////////////////

	private static class Person {
		private final String name;
		private final int age;

		private Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

}
