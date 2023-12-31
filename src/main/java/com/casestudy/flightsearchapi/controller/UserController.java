package com.casestudy.flightsearchapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/home")
    public String home(){
        return "Flight Search API Anasayfa, Hoşgeldiniz";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin login işlemi başarılı!, admin sayfası";
    }

}
