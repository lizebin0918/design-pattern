package com.lzb.builder.v2;

import com.alibaba.fastjson.JSON;
import com.lzb.builder.v1.Person;

/**
 * <br/>
 * Created on : 2021-12-15 22:25
 *
 * @author lizebin
 */
public class Main {

    public static void main(String[] args) {
        Person john = PersonBuilder.builder() // -> returns an instance of StepFirstnameBuilder
                .withFirstname("john") // -> returns an instance of StepLastnamePersonBuilder
                .withLastname("smith") // -> returns an instance of StepEmailPersonBuilder
                .withEmail("john @smith.com") // -> returns an instance of FinalStepPersonBuilder
        .build();
        System.out.println(JSON.toJSONString(john));
    }

}
