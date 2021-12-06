package com.lzb.vistor.xiaofuge;

public class Principal implements Visitor {


    public void visit(Student student) {
        System.out.printf("学生信息 姓名：%s 班级：%s", student.name, student.clazz);
        System.out.println("");
    }

    public void visit(Teacher teacher) {
        System.out.printf("学生信息 姓名：%s 班级：%s 升学率：%s", teacher.name, teacher.clazz, teacher.entranceRatio());
        System.out.println("");
    }

}