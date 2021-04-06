package com.lzb.design.pattern.decorator;

public class ConcreteComponent implements AbstractComponent {

	@Override
	public void doSomething() {
		System.out.println("function A");
	}

}
