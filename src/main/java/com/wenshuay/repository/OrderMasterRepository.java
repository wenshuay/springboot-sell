package com.wenshuay.repository;

import com.wenshuay.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by apple on 18/1/9.
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String > {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
