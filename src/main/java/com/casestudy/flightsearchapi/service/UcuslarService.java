package com.casestudy.flightsearchapi.service;

import com.casestudy.flightsearchapi.model.Ucuslar;

import java.time.LocalDateTime;
import java.util.List;

public interface UcuslarService {
  public String createUcuslar(Ucuslar ucuslar);
  public String updateUcuslar(Ucuslar ucuslar);
  public String deleteUcuslar(String id);
  public Ucuslar getUcuslar(String id);
  public List<Ucuslar> getAllUcuslar();
  public List<Ucuslar> getUcusYonu(String kalkisYeri, String varisYeri, LocalDateTime kalkisTarihi, LocalDateTime donusTarihi);

}