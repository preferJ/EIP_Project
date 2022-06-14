package com.its.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.FileReader;

@Controller
public class HomeController {
    @Autowired


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/sstest")
    public String sstest() {
        return "problemP/sstest";
    }



}
