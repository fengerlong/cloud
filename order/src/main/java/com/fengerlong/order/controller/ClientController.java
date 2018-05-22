package com.fengerlong.order.controller;

import com.fengerlong.order.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ClientController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ProductClient productClient;

    @PostMapping("/getProductMsg")
    public String getProductMsg(String name){
        //第一种方式(直接restTemplate，url写死)
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://127.0.0.1:8080/msg",String.class);

        //第二种方式（使用loadBalancerClient通过应用名获取URL）
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort())+"/msg";
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject(url,String.class);

        //第三种方式(利用@LoadBalanced)
//        String response = restTemplate.getForObject("http://PRODUCT/msg",String.class);
//        log.info("response={}",response);
        String response = productClient.productMsg(name);
        log.info("response={}",response);
        return response;
    }
}
