package com.fengerlong.product.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class ProductInfo {
    //商品Id
    @Id
    private String productId;
    //商品名称
    private String productName;
    //商品价格
    private BigDecimal productPrice;
    //商品库存
    private Integer productStock;
    //商品描述
    private String productDescription;
    //商品图标
    private String productIcon;
    //商品状态 0 正常  1 下架
    private Integer productStatus;
    //类目
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
