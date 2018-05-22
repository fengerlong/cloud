package com.fengerlong.order.repository;

import com.fengerlong.order.OrderApplicationTests;
import com.fengerlong.order.dataObject.OrderMaster;
import com.fengerlong.order.enums.OrderStatusEnum;
import com.fengerlong.order.enums.PayStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testAdd(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("121221212");
        orderMaster.setBuyerName("冯二龙");
        orderMaster.setBuyerAddress("成都旸谷");
        orderMaster.setBuyerOpenid("weixinopenId");
        orderMaster.setBuyerPhone("18215576765");
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMaster.setOrderAmount(new BigDecimal(2.5));

        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertNotNull(result);
    }
}