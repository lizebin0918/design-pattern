package com.lzb.builder.zhangyi.builder;

import com.lzb.builder.zhangyi.Computer;
import lombok.NonNull;

/**
 * <br/>
 * Created on : 2023-08-22 13:00
 * @author lizebin
 */
public class ComputerFactory {

    public static Computer createComputer(@NonNull ComputerBuilder builder) {
        builder.cpu();
        builder.port();
        return builder.build();
    }

}
