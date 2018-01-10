package com.wenshuay.repository;

import com.wenshuay.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by apple on 18/1/8.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{

    List<ProductCategory>  findByCategoryTypeIn(List<Integer> categoryTypeList);

}
