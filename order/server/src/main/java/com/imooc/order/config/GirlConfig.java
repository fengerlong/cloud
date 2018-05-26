package com.imooc.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by 廖师兄
 * 2018-02-03 22:25
 */
@Data
@Component
@ConfigurationProperties("girl") //设置访问前缀
@RefreshScope
public class GirlConfig {

    private String name;

    private Integer age;
}
