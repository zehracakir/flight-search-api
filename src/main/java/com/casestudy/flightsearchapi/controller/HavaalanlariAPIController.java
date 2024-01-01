package com.casestudy.flightsearchapi.controller;

import com.casestudy.flightsearchapi.model.Havaalanlari;
import com.casestudy.flightsearchapi.service.HavaalanlariService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/havaalanlari")
public class HavaalanlariAPIController
{

    HavaalanlariService havaalanlariService;
    public HavaalanlariAPIController(HavaalanlariService havaalanlariService) {
        this.havaalanlariService = havaalanlariService;
    }

    @GetMapping("{id}")
    public Havaalanlari getHavaalanlariDetails(@PathVariable("id") String id)
    {
        return havaalanlariService.getHavaalanlari(id);

    }

    @GetMapping()
    public List<Havaalanlari> getAllHavaalanlariDetails()
    {
        return havaalanlariService.getAllHavaalanlari();
    }

    @PostMapping
    public String createHavaalanlariDetails(@RequestBody Havaalanlari havaalanlari)
    {
        havaalanlariService.createHavaalanlari(havaalanlari);
        return "Havaalani Created Succesfully";
    }

    @PutMapping
    public String updateHavaalanlariDetails(@RequestBody Havaalanlari havaalanlari)
    {
        havaalanlariService.updateHavaalanlari(havaalanlari);
        return "Havaalani Updated Succesfully";
    }

    @DeleteMapping("{id}")
    public String deleteHavaalanlariDetails(@PathVariable("id") String id)
    {
        havaalanlariService.deleteHavaalanlari(id);
        return "Havaalani Deleted Succesfully";
    }

}
