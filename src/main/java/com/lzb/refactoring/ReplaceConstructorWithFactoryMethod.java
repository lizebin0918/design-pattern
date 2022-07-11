package com.lzb.refactoring;

/**
 * <br/>
 * Created on : 2022-07-11 10:52
 *
 * @author lizebin
 */
public class ReplaceConstructorWithFactoryMethod {

    class Employee {
        private int type;
        Employee(int type) {
            this.type = type;
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // refactoring
    ///////////////////////////////////////////////////////////////////////////

    static class Employee1 {

        private int type;
        Employee1(int type) {
            this.type = type;
        }

        static Employee1 create(int type) {
            Employee1 employee = new Employee1(type);
            // do some heavy lifting.
            return employee;
        }
        // ...
    }

}
