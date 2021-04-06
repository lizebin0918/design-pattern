package com.lzb.design.pattern.decorator;

public class Client {

	public static void main(String[] args) {
		
		//这好比一杯饮料（奶茶）
		AbstractComponent component0 = new ConcreteComponent();
		
		//饮料里面加了牛奶
		AbstractComponent component1 = new DecoratorA(component0);

		//还往饮料里面加了绿茶
		AbstractComponent component2 = new DecoratorB(component1);
		
		//那这个就变成了奶茶
		component2.doSomething();
	}
}
