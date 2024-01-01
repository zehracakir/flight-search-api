package com.casestudy.flightsearchapi.service.impl;

import com.casestudy.flightsearchapi.model.Havaalanlari;
import com.casestudy.flightsearchapi.repository.HavaalanlariRepository;
import com.casestudy.flightsearchapi.service.HavaalanlariService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HavaalanlariServiceImpl implements HavaalanlariService {
    private final HavaalanlariRepository havaalanlariRepository;

    public HavaalanlariServiceImpl(HavaalanlariRepository havaalanlariRepository) {
        this.havaalanlariRepository = havaalanlariRepository;
    }

    @Override
    public String createHavaalanlari(Havaalanlari havaalanlari) {
        ObjectId objectId = new ObjectId();
        havaalanlari.setId(objectId.toString());
        havaalanlariRepository.save(havaalanlari);
        return "Success";
    }

    @Override
    public String updateHavaalanlari(Havaalanlari havaalanlari) {
        havaalanlariRepository.save(havaalanlari);
        return "Success";
    }

    @Override
    public String deleteHavaalanlari(String id) {
        havaalanlariRepository.deleteById(id);
        return "Success";
    }

    @Override
    public Havaalanlari getHavaalanlari(String id) {
        return havaalanlariRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Havaalanlari bulunamadı"));
    }

    @Override
    public List<Havaalanlari> getAllHavaalanlari() {
        return havaalanlariRepository.findAll();
    }
}

