package com.wenshuay.exception;

import com.wenshuay.enums.ResultEnum;
import lombok.Data;

/**
 * Created by apple on 18/1/9.
 */
@Data
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
