package com.wenshuay.service.impl;

import com.wenshuay.dataobject.SellerInfo;
import com.wenshuay.repository.SellerInfoRepository;
import com.wenshuay.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by apple on 18/1/12.
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;
    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
