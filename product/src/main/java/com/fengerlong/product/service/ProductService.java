package com.fengerlong.product.service;

import com.fengerlong.product.dataObject.ProductInfo;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();
}
