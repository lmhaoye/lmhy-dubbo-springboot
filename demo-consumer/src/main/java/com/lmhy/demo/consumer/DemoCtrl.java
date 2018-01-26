package com.lmhy.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lmhy.demo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCtrl {

    @Reference
    private DemoService demoService;

    @GetMapping("")
    public String index() {
        return demoService.sayHello("Dubbo");
    }
}
