package com.lsy.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("demo")
public class DemoController {
  @GetMapping("test")
  public String sayHello() {
    return "Hello";
  }
}
