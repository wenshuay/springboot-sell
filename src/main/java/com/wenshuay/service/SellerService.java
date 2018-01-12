package com.wenshuay.service;

import com.wenshuay.dataobject.SellerInfo;

/**
 * Created by apple on 18/1/12.
 */
public interface SellerService {
    SellerInfo findSellerInfoByOpenid(String openid);
}
