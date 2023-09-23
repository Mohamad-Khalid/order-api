package com.example.orderapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalApiService {
    private final RestTemplate restTemplate;
    //private final String apiUrl = "https://api.example.com";
    public ExternalApiService() {
        this.restTemplate = new RestTemplate();
    }

    public String fetchDataFromCouponApi(String apiUrl) {
        String url = apiUrl ;
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }
}
