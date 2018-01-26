package com.lmhy.demo.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@EnableDubboConfiguration
public class DemoProviderApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoProviderApplication.class, args);
		System.in.read();
	}
}
