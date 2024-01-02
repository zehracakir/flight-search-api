package com.casestudy.flightsearchapi.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @GetMapping("/home")
    public String home(){
        return "Flight Search API Anasayfa, Hoşgeldiniz";
    }


}
