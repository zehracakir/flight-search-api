//package com.casestudy.flightsearchapi.repository;
//import com.casestudy.flightsearchapi.model.Ucuslar;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//
//public interface UcuslarRepository extends MongoRepository<Ucuslar, String>
//{
//
//}
package com.casestudy.flightsearchapi.repository;

import com.casestudy.flightsearchapi.model.Ucuslar;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface UcuslarRepository extends MongoRepository<Ucuslar, String> {

    @Query("{kalkisAlani: ?0, varisAlani: ?1, kalkisTarih: ?2}")
    List<Ucuslar> getTekYonluUcuslar(String kalkisAlani, String varisAlani, LocalDateTime kalkisTarih);
    @Query("{kalkisAlani: ?0, varisAlani: ?1, kalkisTarih: ?2, donusTarih: ?3}")
    List<Ucuslar> getCiftYonluUcuslar(String kalkisAlani, String varisAlani, LocalDateTime kalkisTarih, LocalDateTime donusTarih);

}
