package com.example.madspild.controller;


import com.example.madspild.model.DTO;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class htmlcontroller
{

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @GetMapping("/todays_waste_tomorrows_power")
    public String twtp()
    {
        return "twtp";
    }

    @GetMapping("/boardgame")
    public String boardgame()
    {
        return "boardgame";
    }

    @GetMapping("/calculate")
    public String calculator()
    {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute DTO data, Model model)
    {
        String value_1 = data.getValue_1();
        double amountOfPower = 0.54944;
        double amountOfHeat = 2.2322;
        double result1 = Double.parseDouble(value_1) * amountOfHeat;
        double result2 = Double.parseDouble(value_1) * amountOfPower;

        model.addAttribute("result1", result1);
        model.addAttribute("result2", result2);

        return "calculator";
    }

}