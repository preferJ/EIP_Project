package com.its.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired



    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/test")
    public String test() {
        return "test";
    }




}
