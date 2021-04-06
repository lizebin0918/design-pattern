package com.lzb.design.pattern.proxy;

public class RealSubject implements Subject {
	public void doSomething() {
		System.out.println(" RealSubject call doSomething()");
	}
}