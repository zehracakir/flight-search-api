package com.casestudy.flightsearchapi.controller;

import com.casestudy.flightsearchapi.model.Havaalanlari;
import org.springframework.web.bind.annotation.*;

//localhost:8080/havaalanlari/id dedigimiz zaman havaalani bilgilerine ulasabiliriz.
@RestController
@RequestMapping("/havaalanlari")
public class HavaalanlariAPIService {
    Havaalanlari havaalanlari;

    @GetMapping("{id}")
    public Havaalanlari getHavaalanlariDetails(String id)
    {
        return havaalanlari;
        //new  Havaalanlari("id","sehir");
    }

    @PostMapping
    public String createHavaalanlariDetails(@RequestBody Havaalanlari havaalanlari)
    {
        this.havaalanlari=havaalanlari;
        return " Havaalanlari Created Succesfully";
    }

    @PutMapping
    public String updateHavaalanlariDetails(@RequestBody Havaalanlari havaalanlari)
    {
        this.havaalanlari=havaalanlari;
        return "Havaalanlari Updated Succesfully";
    }

    @DeleteMapping("{id}")
    public String deleteHavaalanlariDetails(String id)
    {
        this.havaalanlari=null;
        return "Havaalanlari Deleted Succesfully";
    }

}
