package com.imooc.order.message;

import com.fasterxml.jackson.core.type.TypeReference;
import com.imooc.order.utils.JsonUtil;
import com.imooc.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 接收mq消息
 */
@Slf4j
@Component
public class MqReceiver {

    private  static final String PRODUCT_STOCK_TEMPLATE = "product_stock_%s";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RabbitListener(queues = "productInfo")
    @RabbitHandler
//    @RabbitListener(bindings = @QueueBinding(
//        exchange = @Exchange(""),
//            value = @Queue("sdf")
//    ))
    public void process1(String message){
//        ProductInfoOutput productInfoOutput = (ProductInfoOutput) JsonUtil.fromJson(message,ProductInfoOutput.class);
        List<ProductInfoOutput> productInfoOutputList = (List<ProductInfoOutput>) JsonUtil.fromJson(message,
                new TypeReference<List<ProductInfoOutput>>() {});
        log.info("从队列【{}】接收消息:{}","productInfoOutputList",productInfoOutputList);
        for (ProductInfoOutput productInfoOutput : productInfoOutputList) {
            stringRedisTemplate.opsForValue().set(String.format(PRODUCT_STOCK_TEMPLATE,productInfoOutput.getProductId()),
                productInfoOutput.getProductStock().toString());
        }


//        stringRedisTemplate.opsForValue().set("productInfoString",productInfoOutput.toString());
//        stringRedisTemplate.opsForList().leftPush("productInfoList",productInfoOutput.toString());
//        System.out.println(stringRedisTemplate.opsForValue().get("productInfoString"));

//        stringRedisTemplate.opsForValue().set(String.format(PRODUCT_STOCK_TEMPLATE,productInfoOutput.getProductId()),
//                productInfoOutput.getProductStock().toString());
        //存储在redis中

    }
}
