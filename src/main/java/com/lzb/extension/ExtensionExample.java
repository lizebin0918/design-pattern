package com.lzb.extension;

// 定义一个简单的数据对象
class Data {
    private String name;
    
    public Data(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

// 扩展对象的基类
abstract class Extension {
    protected Data data;
    
    public Extension(Data data) {
        this.data = data;
    }
    
    public abstract void execute();
}

// 具体的扩展对象
class UppercaseExtension extends Extension {
    public UppercaseExtension(Data data) {
        super(data);
    }
    
    @Override
    public void execute() {
        System.out.println(data.getName().toUpperCase());
    }
}

class ReversedExtension extends Extension {
    public ReversedExtension(Data data) {
        super(data);
    }
    
    @Override
    public void execute() {
        StringBuilder sb = new StringBuilder(data.getName());
        System.out.println(sb.reverse());
    }
}

// 客户端代码
public class ExtensionExample {
    public static void main(String[] args) {
        Data data = new Data("Hello");
        
        Extension uppercase = new UppercaseExtension(data);
        uppercase.execute(); // 输出: HELLO
        
        Extension reversed = new ReversedExtension(data);
        reversed.execute(); // 输出: olleH
    }
}