package com.wenshuay.utils;

import com.wenshuay.enums.CodeEnum;

/**
 * Created by apple on 18/1/11.
 */
public class EnumUtil {
    public static < T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return  null;
    }
}
