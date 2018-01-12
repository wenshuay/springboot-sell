package com.wenshuay.form;

import lombok.Data;

/**
 * Created by apple on 18/1/11.
 */
@Data
public class CategoryForm {
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
