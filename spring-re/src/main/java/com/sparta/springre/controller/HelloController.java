package com.sparta.springre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")//중복되는 api를 한번에 적용시켜줄 수 있다.
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
    @GetMapping("/get")
    @ResponseBody
    public String get(){
        return "Get Method 요청";
    }
    @PostMapping("/post")
    @ResponseBody
    public String post(){
        return "Post Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        return "PUT Method 요청";
    }
    @DeleteMapping("/delet")
    @ResponseBody
    public String delet(){
        return "Delte Method 요청";
    }
}
