package com.casestudy.flightsearchapi.service.impl;

import com.casestudy.flightsearchapi.model.Ucuslar;
import com.casestudy.flightsearchapi.repository.UcuslarRepository;
import com.casestudy.flightsearchapi.service.UcuslarService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UcuslarServiceImpl implements UcuslarService {
    UcuslarRepository ucuslarRepository;

    public UcuslarServiceImpl(UcuslarRepository ucuslarRepository) {
        this.ucuslarRepository = ucuslarRepository;
    }

    @Override
    public String createUcuslar(Ucuslar ucuslar) {
        ObjectId objectId = new ObjectId();
        ucuslar.setId(objectId.toString());
        if (ucuslar.getDonusTarih() == null || ucuslar.getDonusTarih().isEmpty()) {
            ucuslar.setDonusTarih(null);
        }
        ucuslarRepository.save(ucuslar);
        return "Success";
    }


    @Override
    public String updateUcuslar(Ucuslar ucuslar) {
        ucuslarRepository.save(ucuslar);
        return "Success";
    }

    @Override
    public String deleteUcuslar(String id) {
        ucuslarRepository.deleteById(id);
        return "Success";
    }

  //  @Override
  //  public Ucuslar getUcuslar(String id) {
  //      return ucuslarRepository.findById(id).get();
  //  }

    @Override
    public Ucuslar getUcuslar(String id) {
        return ucuslarRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ucuslar bulunamadı"));
    }

    @Override
    public List<Ucuslar> getAllUcuslar() {
        return ucuslarRepository.findAll();
    }

    @Override
    public List<Ucuslar> getUcusYonu(String kalkisAlani, String varisAlani, String kalkisTarih, String donusTarih) {
        if (donusTarih == null ||  donusTarih.isEmpty()) {
            return ucuslarRepository.getTekYonluUcuslar(kalkisAlani, varisAlani, kalkisTarih);
        } else {
            return ucuslarRepository.getCiftYonluUcuslar(kalkisAlani, varisAlani, kalkisTarih, donusTarih);
        }
    }


}
