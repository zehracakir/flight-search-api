package com.casestudy.flightsearchapi.service;

import com.casestudy.flightsearchapi.model.Havaalanlari;

import java.util.List;

public interface HavaalanlariService {
    String createHavaalanlari(Havaalanlari havaalanlari);

    String updateHavaalanlari(Havaalanlari havaalanlari);

    String deleteHavaalanlari(String id);

    Havaalanlari getHavaalanlari(String id);

    List<Havaalanlari> getAllHavaalanlari();
}
