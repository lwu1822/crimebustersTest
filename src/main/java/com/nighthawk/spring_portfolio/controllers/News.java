package com.nighthawk.spring_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.IOException;

@Controller // HTTP requests are handled as a controller, using the @Controller annotation


public class News {
    private static final String POSTS_API_URL = "https://jsonplaceholder.typicode.com/posts";
    @GetMapping("/news")
    
    public String api(Model model) throws IOException, InterruptedException, ParseException{
        HttpClient client = HttpClient.newHttpClient(); 
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://world-crime-news1.p.rapidapi.com/news"))
            .header("X-RapidAPI-Key", "cc6d770f58msh120c53d95d27c68p1d2955jsn1898ff4fa031")
            .header("X-RapidAPI-Host", "world-crime-news1.p.rapidapi.com")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(response.body());
        

        System.out.println(response.body());

        model.addAttribute("obj", obj);
        
        
        return "news";
    }

  
    
}
