package com.lzb.proxy.staticproxy;
public class UserServiceImpl implements UserService {

 

    @Override

    public void addUser(String userId, String userName) {

       System.out.println("UserServiceImpl addUser userId->>"+userId);

   }

 

    @Override

    public void delUser(String userId) {

       System.out.println("UserServiceImpl delUser userId->>"+userId);

   }

 

    @Override

    public void modfiyUser(String userId, String userName) {

       System.out.println("UserServiceImpl modfiyUser userId->>"+userId);

   }

 

    @Override

    public String findUser(String userId) {

       System.out.println("UserServiceImpl findUser userId->>"+userId);

       return "张山";

   }

 

}