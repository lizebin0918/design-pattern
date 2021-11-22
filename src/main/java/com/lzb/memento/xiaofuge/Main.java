package com.lzb.memento.xiaofuge;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * 在后续上线时如果发现紧急问题，系统就会需要回滚操作，如果执行回滚那么也可以设置配置文件是否回滚。
 * 因为每一个版本的系统可能会随着带着一些配置文件的信息，
 * 这个时候就可以很方便的让系统与配置文件一起回滚操作。
 * 我们接下来就使用备忘录模式，模拟如何记录配置文件信息。实际的使用过程中还会将信息存放到库中进行保存，这里暂时只是使用内存记录。<br/>
 *
 * Created on : 2021-11-22 19:44
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {

        Admin admin = new Admin();

        ConfigOriginator configOriginator = new ConfigOriginator();
        configOriginator.setConfigFile(new ConfigFile("1000001", "配置内容A=1", new Date(), "小傅哥"));
        // 保存配置
        admin.append(configOriginator.saveMemento());

        configOriginator.setConfigFile(new ConfigFile("1000002", "配置内容A=2", new Date(), "小傅哥"));
        // 保存配置
        admin.append(configOriginator.saveMemento());

        configOriginator.setConfigFile(new ConfigFile("1000003", "配置内容A=3", new Date(), "小傅哥"));
        // 保存配置
        admin.append(configOriginator.saveMemento());

        configOriginator.setConfigFile(new ConfigFile("1000004", "配置内容A=4", new Date(), "小傅哥"));
        // 保存配置
        admin.append(configOriginator.saveMemento());

        // 历史配置(回滚):相当于出栈？好像还不是，只是指针往后移了
        configOriginator.getMemento(admin.undo());
        System.out.printf("历史配置(回滚)undo：%s", JSON.toJSONString(configOriginator.getConfigFile()));
        System.out.println();

        // 历史配置(回滚)
        configOriginator.getMemento(admin.undo());
        System.out.printf("历史配置(回滚)undo：%s", JSON.toJSONString(configOriginator.getConfigFile()));
        System.out.println();

        // 历史配置(前进):指针往前移
        configOriginator.getMemento(admin.redo());
        System.out.printf("历史配置(前进)redo：%s", JSON.toJSONString(configOriginator.getConfigFile()));
        System.out.println();

        // 历史配置(获取)
        configOriginator.getMemento(admin.get("1000002"));
        System.out.printf("历史配置(获取)get：%s", JSON.toJSONString(configOriginator.getConfigFile()));
        System.out.println();
    }

}
