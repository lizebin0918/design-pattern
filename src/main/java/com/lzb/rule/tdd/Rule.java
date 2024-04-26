package com.lzb.rule.tdd;

/**
 * <br/>
 * Created on : 2024-04-26 13:01
 * @author lizebin
 */
public interface Rule {

    /**
     * apply
     * @param x
     * @return
     */
    java.util.Optional<String> apply(int x);

}
