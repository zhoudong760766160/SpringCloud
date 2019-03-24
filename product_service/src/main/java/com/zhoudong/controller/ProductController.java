package com.zhoudong.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zhoudong.Service.ProductService;
import com.zhoudong.dto.ProductDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoudong
 * @create 2019/3/3
 * product controller
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProductService productService;

    @RequestMapping("/list")
    public Object listProduct(){
        return productService.list();
    }

    @RequestMapping("/find")
    public Object getProductById(@RequestParam("id") int id){
        ProductDto productDto = productService.getProductById(id);

        //需要克隆，因为数据保存在内存，修改会保留
        ProductDto result = new ProductDto();
        BeanUtils.copyProperties(productDto,result);
        result.setName(result.getName()+":"+port);
        return result;
    }

}
