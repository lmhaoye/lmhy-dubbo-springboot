package com.lmhy.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.lmhy.demo.service.DemoService;

@Service
@org.springframework.stereotype.Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
