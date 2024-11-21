package com.spring.MyChef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // Ensure 'login.html' is in the 'templates' folder
    }
}
