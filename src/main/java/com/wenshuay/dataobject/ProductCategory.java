package com.wenshuay.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.Date;

/**
 * Created by apple on 18/1/8.
 */

@Entity
@DynamicUpdate
@Data

public class ProductCategory {

    @javax.persistence.Id
    @GeneratedValue
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;


    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
