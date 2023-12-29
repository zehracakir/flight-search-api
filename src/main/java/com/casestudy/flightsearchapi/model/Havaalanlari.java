package com.casestudy.flightsearchapi.model;

public class Havaalanlari {


    private String id;
    private String sehir;

    public Havaalanlari() {
    }

    public Havaalanlari(String id, String sehir) {
        this.id = id;
        this.sehir = sehir;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

}
