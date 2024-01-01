package com.casestudy.flightsearchapi.repository;

import com.casestudy.flightsearchapi.model.Havaalanlari;
import com.casestudy.flightsearchapi.model.Ucuslar;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HavaalanlariRepository extends MongoRepository<Havaalanlari, String> {
}
