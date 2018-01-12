package com.wenshuay.repository;

import com.wenshuay.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by apple on 18/1/12.
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}
