package com.swisscom.gsagse.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("/hello")
    public HashMap<String, String> getHello(){
        HashMap<String, String> map = new HashMap<>();
        map.put("Testing", "Hello Earth!");
        return map;
    }
}
