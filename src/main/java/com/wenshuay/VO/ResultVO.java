package com.wenshuay.VO;

import javassist.SerialVersionUID;
import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by apple on 18/1/9.
 */

@Data
public class ResultVO<T> implements Serializable{


    private static final long serialVersionUID = -8338352352567592941L;
    private Integer code;

    private String msg;

    private T data;
}
