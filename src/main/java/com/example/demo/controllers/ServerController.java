package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController
{
    @GetMapping("/central-bank/wealth-threshold")
    public String home(Model model) {
        model.addAttribute("title", "Main page");
        return "home";
    }

    @GetMapping("/central-bank/wealth-threshold")
    public String about(Model model) {
        model.addAttribute("title", "About");
        return "about";
    }
}
