package com.zhoudong.Service;

import com.zhoudong.dto.ProductDto;

import java.util.List;

public interface ProductService {

    public List<ProductDto> list();

    public ProductDto getProductById(int id);
}
