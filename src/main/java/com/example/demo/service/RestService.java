package com.example.demo.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService
{

    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder)
    {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Double getAsset(String city) {
        String url = "central-bank/regional-info/evaluate?city="+city;
        return this.restTemplate.getForObject(url, Double.class);
    }

    public Double getWealthThreshold() {
        String url = "central-bank/wealth-threshold";
        return this.restTemplate.getForObject(url, Double.class);
    }


}
