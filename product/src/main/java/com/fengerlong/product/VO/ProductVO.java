package com.fengerlong.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductVO {

    @JsonProperty("name") //返回给前端的字段
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    private List<ProductInfoVO> productInfoVOList;
}
