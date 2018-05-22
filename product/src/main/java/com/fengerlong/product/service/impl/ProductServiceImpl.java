package com.fengerlong.product.service.impl;

import com.fengerlong.product.dataObject.ProductInfo;
import com.fengerlong.product.enums.ProductStatusEnum;
import com.fengerlong.product.repository.ProductInfoRepository;
import com.fengerlong.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
