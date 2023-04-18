package com.lzb.validation_1;
 
import lombok.Data;

@Data
public class UserDTO {
 
    private String message;
 
    public UserDTO() {
    }
 
    public UserDTO(String message) {
        this.message = message;
    }
}