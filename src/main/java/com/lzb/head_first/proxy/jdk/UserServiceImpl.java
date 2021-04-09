package com.lzb.head_first.proxy.jdk;

public class UserServiceImpl {

 


         public void addUser(String userId, String userName) {

                   System.out.println("UserServiceImpl addUser userId->>"+userId);

        }

 


         public void delUser(String userId) {

                   System.out.println("UserServiceImpl delUser userId->>"+userId);

        }

 


         public void modfiyUser(String userId, String userName) {

                   System.out.println("UserServiceImpl modfiyUser userId->>"+userId);

        }

 


         public String findUser(String userId) {

                   System.out.println("UserServiceImpl findUser userId->>"+userId);

                   return "张山";

        }

 


         public void sayHello(String name) {

                   System.out.println("你好："+name);

        }

 


         public int addOperter(int num, int num2) {

                   return num+num2;

        }

}