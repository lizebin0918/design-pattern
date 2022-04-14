package com.lzb.pricinple.ocp.demo1.v1;

import lombok.Data;

@Data
public class EmployeeModel {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private boolean isManager = false;
    private boolean isExecutive = false;
}