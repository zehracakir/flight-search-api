package com.casestudy.flightsearchapi.controller;

import com.casestudy.flightsearchapi.model.Ucuslar;
import org.springframework.web.bind.annotation.*;

//localhost:8080/ucuslar/id dedigimiz zaman ucus bilgilerine ulasabiliriz.
@RestController
@RequestMapping("/ucuslar")
public class UcuslarAPIService
{
    Ucuslar ucuslar;

    @GetMapping("{id}")
    public Ucuslar getUcuslarDetails(String id)
    {
        return ucuslar;
                //new Ucuslar("id","kalkis alani", "varis alani","kalkis tarih", "donus tarih", "fiyat");
    }

    @PostMapping
    public String createUcuslarDetails(@RequestBody Ucuslar ucuslar)
    {
        this.ucuslar=ucuslar;
        return "Ucuslar Created Succesfully";
    }

    @PutMapping
    public String updateUcuslarDetails(@RequestBody Ucuslar ucuslar)
    {
        this.ucuslar=ucuslar;
        return "Ucuslar Updated Succesfully";
    }

    @DeleteMapping("{id}")
    public String deleteUcuslarDetails(String id)
    {
        this.ucuslar=null;
        return "Ucuslar Deleted Succesfully";
    }

}
