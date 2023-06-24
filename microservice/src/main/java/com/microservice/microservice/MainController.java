package com.microservice.microservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Value("${server.port}")
    private  String port;

    @GetMapping("/**")
    public String callServer() {
        return "server is running on port: "+ port;
    }
}
