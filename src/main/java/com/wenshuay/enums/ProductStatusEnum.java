package com.wenshuay.enums;

import lombok.Getter;

/**
 * Created by apple on 18/1/9.
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0, "在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
