package com.tssboot.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomePageController {

    public WelcomePageController() {
    }

    @RequestMapping({"/", "/welcome-page"})
    public String welcome() {
        return "welcome-page";
    }
}
