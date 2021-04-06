package com.lzb.design.pattern.proxy.cglib;


import com.lzb.design.pattern.proxy.jdk.UserServiceImpl;
import org.springframework.cglib.proxy.Enhancer;

public class CglibClient {

	public static void main(String[] args) {
		cglibUse1();
	}

	public static void cglibUse1() {
		Enhancer enhancer = new Enhancer();
		// 设置被代理的类（目标类）
		enhancer.setSuperclass(UserServiceImpl.class);
		// 使用回调
		enhancer.setCallback(new com.lzb.design.pattern.proxy.cglib.CglibProxy());
		// 创造 代理 （动态扩展了UserServiceImpl类）
		UserServiceImpl my = (UserServiceImpl) enhancer.create();
		System.out.println("parent : " + my.getClass().getSuperclass().getCanonicalName());
		// my.addUser("001", "centre");
		int ret = my.addOperter(15, 22);
		System.out.println("返回的结果是：" + ret);
	}
}