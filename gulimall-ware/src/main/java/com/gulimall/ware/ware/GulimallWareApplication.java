package com.gulimall.ware.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.gulimall.ware.ware.dao")
@SpringBootApplication
public class GulimallWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallWareApplication.class, args);
	}

}
