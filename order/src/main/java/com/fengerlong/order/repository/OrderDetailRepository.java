package com.fengerlong.order.repository;

import com.fengerlong.order.dataObject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

}
