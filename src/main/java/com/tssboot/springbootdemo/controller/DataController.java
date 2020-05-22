package com.tssboot.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataController {

    public DataController() {
    }

    @RequestMapping("/data")
    public String data() {
        return "data";
    }
}
