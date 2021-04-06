package com.lzb.design.pattern.proxy.staticproxy;
public interface UserService {  
    public void addUser(String userId,String userName);  
    public void delUser(String userId);  
    public void modfiyUser(String userId,String userName);  
    public String findUser(String userId);  
} 