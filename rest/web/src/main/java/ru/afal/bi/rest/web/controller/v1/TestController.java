package ru.afal.bi.rest.web.controller.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
  @GetMapping("/home")
  public String index() {
    return "home";
  }
}
