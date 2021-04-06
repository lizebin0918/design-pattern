package com.lzb.design.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler {

	private Object targertObject;

	public Object newInstance(Object targertObject) {

		this.targertObject = targertObject;

		Class targertClass = targertObject.getClass();

		System.out.println(targertClass.getInterfaces());
		return Proxy.newProxyInstance(targertClass.getClassLoader(),
				null, this);

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)

	throws Throwable {
		System.out.println("调用方法" + method.getName());
		Object ret = null;
		try {
			ret = method.invoke(targertObject, args);
			System.out.print("成功调用方法：" + method.getName() + ";参数为：");
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("调用方法：" + method.getName() + "失败;参数为：");
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i]);
			}
		}
		return ret;

	}

}