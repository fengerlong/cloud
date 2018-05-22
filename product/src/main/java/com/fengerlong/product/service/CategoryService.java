package com.fengerlong.product.service;

import com.fengerlong.product.dataObject.ProductCategory;

import java.util.List;

public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
