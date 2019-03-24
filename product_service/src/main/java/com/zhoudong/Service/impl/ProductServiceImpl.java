package com.zhoudong.Service.impl;

import com.zhoudong.Service.ProductService;
import com.zhoudong.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoudong
 * @create 2019/3/6
 * product service impl
 */
@Service
public class ProductServiceImpl implements ProductService {

    static List<ProductDto> list = new ArrayList<ProductDto>();

    static {
        list.add(new ProductDto(1,"iPhone",5888.88,10));
        list.add(new ProductDto(2,"iPad",3299,5));
        list.add(new ProductDto(3,"iPod",588.88,2));
        list.add(new ProductDto(4,"MacAir",12999.9,8));
    }

    @Override
    public List<ProductDto> list() {
        return list;
    }

    @Override
    public ProductDto getProductById(int id) {
        ProductDto result = new ProductDto();
        for(ProductDto productDto : list){
            if (productDto.getId() == id){
                result =  productDto;
            }
        }
        return result;
    }
}
