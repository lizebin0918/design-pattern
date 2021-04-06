package com.lzb.design.pattern.decorator;

public class DecoratorA extends Decorator {

	public DecoratorA(AbstractComponent component) {
		super(component);
	}
	
	@Override
	public void doSomething() {
		super.doSomething();
		
		doAnotherThing();
	}
	
	public void doAnotherThing() {
		System.out.println("Decorator A is doing another thing.");
	}

}
