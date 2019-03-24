package com.zhoudong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

    /**
     * ribben伪HTTP调用方式
     * @LoadBalanced 均衡负载器
     * @return
     */
	@Bean
	@LoadBalanced
    public RestTemplate getRestTemplate(){
	    return new RestTemplate();
    }
}