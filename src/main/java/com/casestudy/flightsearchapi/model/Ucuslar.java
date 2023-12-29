package com.casestudy.flightsearchapi.model;

public class Ucuslar {
    private String id;
    private String kalkisAlani;
    private String varisAlani;
    private String kalkisTarih;
    private String donusTarih;
    private String fiyat;

    public Ucuslar() {
    }

    public Ucuslar(String id, String kalkisAlani, String varisAlani, String kalkisTarih, String donusTarih, String fiyat) {
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

    public String getKalkisTarih() {
        return kalkisTarih;
    }

    public void setKalkisTarih(String kalkisTarih) {
        this.kalkisTarih = kalkisTarih;
    }

    public String getDonusTarih() {
        return donusTarih;
    }

    public void setDonusTarih(String donusTarih) {
        this.donusTarih = donusTarih;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }


}
