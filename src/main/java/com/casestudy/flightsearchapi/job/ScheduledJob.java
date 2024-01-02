package com.casestudy.flightsearchapi.job;

import com.casestudy.flightsearchapi.model.Ucuslar;
import com.casestudy.flightsearchapi.repository.UcuslarRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ScheduledJob {

    private final UcuslarRepository ucuslarRepository;
    private final RestTemplate restTemplate;

    public ScheduledJob(UcuslarRepository ucuslarRepository, RestTemplate restTemplate) {
        this.ucuslarRepository = ucuslarRepository;
        this.restTemplate = restTemplate;
    }

    @Scheduled(cron = "0 0 * * * ?")
    public void runScheduledJob() {
        System.out.println("Zamanlanmış görev çalışıyor...");
        String mockApiUrl = "https://run.mocky.io/v3/1305924e-8c86-4759-acca-5620d6210252";
        String mockApiResponse = restTemplate.getForObject(mockApiUrl, String.class);

        List<Ucuslar> yeniUcuslar = convertApiResponseToEntities(mockApiResponse);

        if (yeniUcuslar != null && !yeniUcuslar.isEmpty()) {
            ucuslarRepository.saveAll(yeniUcuslar);
        } else {
            System.out.println("Kaydedilecek varlık yok.");
        }
    }

    private List<Ucuslar> convertApiResponseToEntities(String apiResponse) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        try {
            Ucuslar[] ucuslarArray = objectMapper.readValue(apiResponse, Ucuslar[].class);
            return Arrays.asList(ucuslarArray);
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}
