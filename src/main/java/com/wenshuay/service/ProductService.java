package com.wenshuay.service;

import com.wenshuay.dataobject.OrderDetail;
import com.wenshuay.dataobject.ProductInfo;
import com.wenshuay.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by apple on 18/1/9.
 */
public interface ProductService {
    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

}
