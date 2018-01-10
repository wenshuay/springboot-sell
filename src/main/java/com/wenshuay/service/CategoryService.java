package com.wenshuay.service;

import com.wenshuay.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by apple on 18/1/8.
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
