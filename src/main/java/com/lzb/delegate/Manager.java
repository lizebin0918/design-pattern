package com.lzb.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 项目经理<br/>
 * Created on : 2021-05-15 21:26
 * @author lizebin
 */
public class Manager {

    private final Map<String, IEmployee> register = new HashMap<>();

    public void doing(String command) {
        register.get(command).doing(command);
    }

    public Manager() {
        register.put("A_Module", new EmployeeA());
        register.put("B_Module", new EmployeeB());
    }

}
