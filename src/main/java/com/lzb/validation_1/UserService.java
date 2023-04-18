package com.lzb.validation_1;
 

public interface UserService {
 
    UserDTO checkUser(UserParam userParam);
 
    UserDTO checkUserSome(UserParam userParam);
}