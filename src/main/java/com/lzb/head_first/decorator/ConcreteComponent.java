package com.lzb.head_first.decorator;

public class ConcreteComponent implements AbstractComponent {

	@Override
	public void doSomething() {
		System.out.println("function A");
	}

}
