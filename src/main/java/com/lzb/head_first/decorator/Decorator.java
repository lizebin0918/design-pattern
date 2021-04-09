package com.lzb.head_first.decorator;

public class Decorator implements AbstractComponent {

	private AbstractComponent component;
	public Decorator(AbstractComponent component) {
		this.component = component;
	}
	
	@Override
	public void doSomething() {
		component.doSomething();
	}
	
	

}
