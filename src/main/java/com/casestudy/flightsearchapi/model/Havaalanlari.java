package com.casestudy.flightsearchapi.model;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "havaalanlari")
public class Havaalanlari {

    @Id
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
