package com.wenshuay.dto;

import lombok.Data;

/**
 * Created by apple on 18/1/9.
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
