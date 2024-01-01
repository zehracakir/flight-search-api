package com.casestudy.flightsearchapi.model;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "ucuslar")
public class Ucuslar
{
    @Id
    private String id;
    @Field("kalkisAlani")
    private String kalkisAlani;
    @Field("varisAlani")
    private String varisAlani;
    @Field("kalkisTarih")
    private LocalDateTime kalkisTarih;
    @Field("donusTarih")
    private LocalDateTime donusTarih;
    @Field("fiyat")
    private int fiyat;

    public Ucuslar() {
    }

    public Ucuslar(String id, String kalkisAlani, String varisAlani, LocalDateTime kalkisTarih, LocalDateTime donusTarih, int fiyat) {
        this.id = id;
        this.kalkisAlani = kalkisAlani;
        this.varisAlani = varisAlani;
        this.kalkisTarih = kalkisTarih;
        this.donusTarih = donusTarih;
        this.fiyat = fiyat;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKalkisAlani() {
        return kalkisAlani;
    }

    public void setKalkisAlani(String kalkisAlani) {
        this.kalkisAlani = kalkisAlani;
    }

    public String getVarisAlani() {
        return varisAlani;
    }

    public void setVarisAlani(String varisAlani) {
        this.varisAlani = varisAlani;
    }

    public LocalDateTime getKalkisTarih() {
        return kalkisTarih;
    }

    public void setKalkisTarih(LocalDateTime kalkisTarih) {
        this.kalkisTarih = kalkisTarih;
    }

    public LocalDateTime getDonusTarih() {
        return donusTarih;
    }

    public void setDonusTarih(LocalDateTime donusTarih) {
        this.donusTarih = donusTarih;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }


}
