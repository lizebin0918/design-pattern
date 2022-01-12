package com.lzb.builder.v1;

import com.alibaba.fastjson.JSON;

/**
 * <br/>
 * Created on : 2021-12-15 22:17
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        Person person = Person.Builder.builder().withFirstname("li").withLastname("zebin").withNickName("青蛙").build();

        // 错误写法
        Person person1 = Person.Builder.builder().build();

        System.out.println(JSON.toJSONString(person));
    }

}
