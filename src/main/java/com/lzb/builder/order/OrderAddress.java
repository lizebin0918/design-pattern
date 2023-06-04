package com.lzb.builder.order;

import com.lzb.builder.valueObj.FullName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * <br/>
 * Created on : 2023-06-04 09:56
 * @author mac
 */
@Getter
@Builder
@AllArgsConstructor
public class OrderAddress {

    private long orderId;
    private FullName fullName;

    private String country;

}
