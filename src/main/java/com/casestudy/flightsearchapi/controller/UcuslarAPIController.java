package com.casestudy.flightsearchapi.controller;

import com.casestudy.flightsearchapi.model.UcusApiResponse;
import com.casestudy.flightsearchapi.model.Ucuslar;
import com.casestudy.flightsearchapi.service.UcuslarService;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Flight Search API",
                version = "1.0.0",
                description = "Bir uçuş arama uygulaması için backend API olarak geliştirildi",
                termsOfService = "https://github/zehracakir",
                contact = @io.swagger.v3.oas.annotations.info.Contact(
                        name = "Zehra Çakır",
                        url = "https://github/zehracakir",
                        email = "flightsearchapi@gmail.com"
                )
        )
)
@RestController
@RequestMapping("/ucuslar")
public class UcuslarAPIController
{

    UcuslarService ucuslarService;
    public UcuslarAPIController(UcuslarService ucuslarService) {
        this.ucuslarService = ucuslarService;
    }

    @GetMapping("{id}")
    public Ucuslar getUcuslarDetails(@PathVariable("id") String id)
    {
        return ucuslarService.getUcuslar(id);
                //new Ucuslar("id","kalkis alani", "varis alani","kalkis tarih", "donus tarih", "fiyat");
    }

    @GetMapping()
    public List<Ucuslar> getAllUcuslarDetails()
    {
        return ucuslarService.getAllUcuslar();
        //new Ucuslar("id","kalkis alani", "varis alani","kalkis tarih", "donus tarih", "fiyat");
    }

    @PostMapping
    public String createUcuslarDetails(@RequestBody Ucuslar ucuslar)
    {
        ucuslarService.createUcuslar(ucuslar);
        return "Ucuslar Created Succesfully";
    }

    @PutMapping
    public String updateUcuslarDetails(@RequestBody Ucuslar ucuslar)
    {
        ucuslarService.updateUcuslar(ucuslar);
        return "Ucuslar Updated Succesfully";
    }

    @DeleteMapping("{id}")
    public String deleteUcuslarDetails(@PathVariable("id") String id)
    {
        ucuslarService.deleteUcuslar(id);
        return "Ucuslar Deleted Succesfully";
    }
 // @GetMapping("/searchapi")
 // public List<Ucuslar> searchApiUcuslarDetails(
 //         @RequestParam String kalkisAlani,
 //         @RequestParam String varisAlani,
 //         @RequestParam String kalkisTarih,
 //         @RequestParam(required = false) String donusTarih
 // ) {
 //     if (donusTarih != null && donusTarih.isEmpty()) {
 //         donusTarih = null;
 //     }
 //     return ucuslarService.getUcusYonu(kalkisAlani, varisAlani, kalkisTarih, donusTarih);
 // }
 @GetMapping("/searchapi")
 public UcusApiResponse searchApiUcuslarDetails(
         @RequestParam String kalkisAlani,
         @RequestParam String varisAlani,
         @RequestParam LocalDateTime kalkisTarih,
         @RequestParam(required = false) LocalDateTime donusTarih
 ) {

     List<Ucuslar> ucuslar = ucuslarService.getUcusYonu(kalkisAlani, varisAlani, kalkisTarih, donusTarih);

     UcusApiResponse response = new UcusApiResponse();
     response.setUcusTuru(donusTarih == null ? "TekYonlu" : "CiftYonlu");
     response.setUcuslar(ucuslar);

     if (donusTarih != null) {
         Ucuslar donusUcusu = new Ucuslar();
         donusUcusu.setId(new ObjectId().toString());
         donusUcusu.setKalkisAlani(varisAlani);
         donusUcusu.setVarisAlani(kalkisAlani);
         donusUcusu.setKalkisTarih(donusTarih);
         donusUcusu.setFiyat(ucuslar.get(0).getFiyat());

         response.getUcuslar().add(donusUcusu);
     }

     return response;
 }
}
