package com.lzb.proxy.jdk;



public class Client {

	public static void main(String[] args) {

		System.out.println(new LogHandler()
				.newInstance(new UserServiceImpl()));
		UserServiceImpl Service = (UserServiceImpl)new LogHandler()
				.newInstance(new UserServiceImpl());

		UserServiceImpl userService = (UserServiceImpl) new LogHandler()
				.newInstance(new UserServiceImpl());

		userService.addUser("001", "centre");

		String name = userService.findUser("002");

		System.out.println(name);

		int num = Service.addOperter(12, 23);

		System.out.println(num);

		Service.sayHello("centre");

	}

}