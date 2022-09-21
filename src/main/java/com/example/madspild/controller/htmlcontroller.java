package com.example.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class htmlcontroller {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/todays_waste_tomorrows_power")
    public String twtp() {
        return "twtp";
    }
    @GetMapping("/boardgame")
    public String boardgame() {
        return "boardgame";
    }
    @GetMapping("/calculator")
    public String calculator() {
        return "calculator";
    }

}