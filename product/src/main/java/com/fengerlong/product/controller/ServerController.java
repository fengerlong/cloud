package com.fengerlong.product.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @PostMapping("/msg")
    public String msg(String name){
        return "this is product msg"+name;
    }
}
