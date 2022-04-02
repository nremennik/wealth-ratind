package com.example.demo.person;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.Entity;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FinancialInfo
{
    private double cash;
    private Double numberOfAssets;

    public double getCash()
    {
        return cash;
    }

    public void setCash(double cash)
    {
        this.cash = cash;
    }

    public Double getNumberOfAssets()
    {
        return numberOfAssets;
    }

    public void setNumberOfAssets(Double numberOfAssets)
    {
        this.numberOfAssets = numberOfAssets;
    }
}
