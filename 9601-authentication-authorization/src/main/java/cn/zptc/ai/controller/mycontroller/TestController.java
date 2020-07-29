package cn.zptc.ai.controller.mycontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.port}")
    public String serverPort;
    @Value("${spring.main.allow-bean-definition-overriding}")
    private String test;

    @GetMapping("/serverPort")
    public String serverPort(){
        return serverPort+test;
    }
}
