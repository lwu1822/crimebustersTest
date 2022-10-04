package com.nighthawk.spring_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 

public class Map {
    @GetMapping("/map")
    public String map() {

        // load HTML VIEW (birds.html)
        return "map";

    }
}
