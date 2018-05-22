package com.fengerlong.order.service.impl;

import com.fengerlong.order.dataObject.OrderDetail;
import com.fengerlong.order.dataObject.OrderMaster;
import com.fengerlong.order.dto.OrderDTO;
import com.fengerlong.order.enums.OrderStatusEnum;
import com.fengerlong.order.enums.PayStatusEnum;
import com.fengerlong.order.repository.OrderDetailRepository;
import com.fengerlong.order.repository.OrderMasterRepository;
import com.fengerlong.order.service.OrderService;
import com.fengerlong.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        orderDTO.setOrderId(KeyUtil.genUniqueKey());
        OrderMaster orderMaster = new OrderMaster();
        BeanUtils.copyProperties(orderDTO,orderMaster);
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setOrderAmount(new BigDecimal(1));

        orderMasterRepository.save(orderMaster);
//        List<OrderDetail> list = orderDTO.getOrderDetailList();
        return orderDTO;
    }
}
