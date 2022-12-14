package com.lzb.refactoring.composing.methods;

import java.util.Arrays;
import java.util.List;

/**
 * <br/>
 * Created on : 2022-07-08 09:53
 *
 * @author lizebin
 */
public class SubstituteAlgorithm {

    String foundPerson(String[] people){
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")){
                return "Don";
            }
            if (people[i].equals("John")){
                return "John";
            }
            if (people[i].equals("Kent")){
                return "Kent";
            }
        }
        return "";
    }

    ///////////////////////////////////////////////////////////////////////////
    //
    ///////////////////////////////////////////////////////////////////////////

    String foundPerson1(String[] people){
        var candidates = Arrays.asList("Don", "John", "Kent");
        for (int i=0; i < people.length; i++) {
            if (candidates.contains(people[i])) {
                return people[i];
            }
        }
        return "";
    }

}
