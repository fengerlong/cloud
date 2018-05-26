//package com.imooc.order;
//
//import com.imooc.order.message.MqSender;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * 发送mq消息信息
// */
//@Component
//public class MqTest extends OrderApplicationTests {
//
//    @Autowired
//    private MqSender mqSender;
//
//    @Test
//    public void oneToMany() throws Exception {
//        for (int i=0;i<100;i++){
//            mqSender.send(i);
//        }
//    }
//}
