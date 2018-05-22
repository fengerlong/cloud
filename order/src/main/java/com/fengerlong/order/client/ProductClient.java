package com.fengerlong.order.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "product") //访问的是哪个应用的接口
public interface ProductClient {

    @PostMapping("/msg")
    String productMsg(String name);
}
