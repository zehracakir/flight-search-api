package com.casestudy.flightsearchapi.model;

import java.util.List;

public class UcusApiResponse {
    private String ucusTuru; // TekYonlu veya CiftYonlu
    private List<Ucuslar> ucuslar;

    public String getUcusTuru() {
        return ucusTuru;
    }

    public void setUcusTuru(String ucusTuru) {
        this.ucusTuru = ucusTuru;
    }

    public List<Ucuslar> getUcuslar() {
        return ucuslar;
    }

    public void setUcuslar(List<Ucuslar> ucuslar) {
        this.ucuslar = ucuslar;
    }
}

