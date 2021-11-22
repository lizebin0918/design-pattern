package com.lzb.memento.xiaofuge;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ConfigFile {

    // 版本号
    private String versionNo;
    // 内容
    private String content;
    // 时间
    private Date dateTime;
    // 操作人
    private String operator;
    
}