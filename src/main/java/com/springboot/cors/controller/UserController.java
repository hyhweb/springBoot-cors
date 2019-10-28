package com.springboot.cors.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  /*@CrossOrigin(value="https://www.w3school.com.cn")*/
  @PostMapping("/test")
  public String Test() {
    return "test";
  }
}
