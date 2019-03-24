package com.zhoudong.controller;

import com.zhoudong.dto.ProductOrderDto;
import com.zhoudong.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

/**
 * @author zhoudong
 * @create 2019/3/7
 */
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/save")
    public Object saveOrder(@RequestParam("id") int orderId,@RequestParam("username") String username){
        ProductOrderDto orderDto = new ProductOrderDto();

        //url为服务方应用的名称及其接口组合而成
        Object productDto = restTemplate.getForObject("http://product-service/api/v1/product/find?id="+orderId,Object.class);
        System.out.println(productDto);

        orderDto.setId(new Random().nextInt(100));
        orderDto.setUsername(username);
        return orderDto;
    }
}
