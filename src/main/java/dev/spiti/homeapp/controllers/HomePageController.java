package dev.spiti.homeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kon1299 on 2019-03-16
 */
@Controller
public class HomePageController {
  
  @RequestMapping({"","/"})
  public String getHome() {
    return "index";
  }
}
