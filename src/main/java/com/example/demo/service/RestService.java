package com.example.demo.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RestService
{

    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder)
    {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Double getAsset(String city) {
        Map<String,String> params = new HashMap<>();
        params.put("city",city);
        String url = "http://localhost:8080/central-bank/regional-info/evaluate?city={city}";

        return this.restTemplate.getForObject(url, Double.class, params);
    }

    public Double getWealthThreshold() {
        String url = "http://localhost:8080/central-bank/wealth-threshold";
        return this.restTemplate.getForObject(url, Double.class);
    }


}
