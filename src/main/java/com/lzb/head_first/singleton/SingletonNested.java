package com.lzb.design.pattern.singleton;


public class SingletonNested {

	static {
		System.out.println("1");
	}
	{
		System.out.println("5");
	}
	private SingletonNested() {
		System.out.println("2");
	}
	
	public static SingletonNested getInstance() {
		return Nested.instance;
	}
	
	static class Nested {
		static {
			System.out.println("3");
		}
		private static final SingletonNested instance = new SingletonNested();
	}
	public static void main(String[] args) {
		System.out.println("4");
		SingletonNested instance = SingletonNested.getInstance();
	}
}
