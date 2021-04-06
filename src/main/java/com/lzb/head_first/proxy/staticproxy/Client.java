package com.lzb.design.pattern.proxy.staticproxy;
public class Client {

         public static void main(String[] args) {

          UserService userService=new UserServiceImplProxy(new UserServiceImpl());

          userService.addUser("001", "centre");

        }

}