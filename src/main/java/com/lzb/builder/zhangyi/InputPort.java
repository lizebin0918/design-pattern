package com.lzb.builder.zhangyi;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 输入端口<br/>
 * Created on : 2023-08-22 10:28
 * @author lizebin
 */
@Getter
@AllArgsConstructor
public class InputPort implements Port {

    private int port;

    @Override
    public void transfer() {
        System.out.println("输入端口");
    }
}
