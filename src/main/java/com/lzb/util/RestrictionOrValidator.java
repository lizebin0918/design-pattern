package com.lzb.util;

/**
 * <br/>
 * Created on : 2023-04-08 11:06
 * @author lizebin
 */
public interface RestrictionOrValidator<T> {

    ValidationResult validate(T t);

}
