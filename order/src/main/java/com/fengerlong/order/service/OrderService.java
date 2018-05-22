package com.fengerlong.order.service;

import com.fengerlong.order.dto.OrderDTO;

public interface OrderService {

    /**
     * 创建订单
     */
    OrderDTO create(OrderDTO orderDTO);
}
