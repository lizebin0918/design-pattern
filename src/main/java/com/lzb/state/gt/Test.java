package com.lzb.state.gt;

import org.apache.commons.lang3.StringUtils;

/**
 * <br/>
 * Created on : 2022-06-01 23:21
 *
 * @author lizebin
 */
public class Test {

    public static void main(String[] args) {
        String sql = "INSERT INTO plutus.warehouse_location (warehouse_id, warehouse_location_code) VALUES (3, 'Z%s-%s');";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 240; j++) {
                System.out.println(String.format(sql, i, StringUtils.leftPad(String.valueOf(j), 3, '0')));
            }
        }
    }

}
