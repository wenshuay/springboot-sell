package com.wenshuay.VO;

import lombok.Data;

/**
 * Created by apple on 18/1/9.
 */

@Data
public class ResultVO<T> {
    private Integer code;

    private String msg;

    private T data;
}
