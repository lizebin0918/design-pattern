package com.lzb.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object parentObj, Method method, Object[] args, MethodProxy childProxy) throws Throwable {
		System.out.println("调用的方法是：" + method.getName());
		Object ret = null;
		try {
			//目标方法的调用
			ret = childProxy.invokeSuper(parentObj, args);
			System.out.print("成功调用方法：" + method.getName() + ";参数为：");
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i]);
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