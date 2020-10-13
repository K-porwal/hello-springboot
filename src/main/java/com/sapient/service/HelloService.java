package com.sapient.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/api/hello")
@RestController
public class HelloService {

    @GetMapping("/{name}")
    public Map<String, Object> getHelloMessage(@PathVariable String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", "Hello, " + name + "!");
        map.put("timestamp", new Date().toString());
        return map;
    }
}
