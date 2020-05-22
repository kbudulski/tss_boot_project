package com.tssboot.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/access-denied")
    public String showAccessDenied() {
        return "access-denied";
    }
}
