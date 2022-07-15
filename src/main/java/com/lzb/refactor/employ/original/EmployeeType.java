package com.lzb.refactor.employ.original;

public abstract class EmployeeType {
    public static final int ENGINEER = 1;
    public static final int SALESMAN = 2;
    public static final int MANAGER = 3;

    public abstract int getTypeCode();
}
