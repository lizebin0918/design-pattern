package com.lzb.head_first.decorator;

public class DecoratorB extends Decorator {

	public DecoratorB(AbstractComponent component) {
		super(component);
	}
	
	@Override
	public void doSomething() {
		super.doSomething();
		
		doAnotherThing();
	}
	
	public void doAnotherThing() {
		System.out.println("Decorator B is doing another thing.");
	}

}
