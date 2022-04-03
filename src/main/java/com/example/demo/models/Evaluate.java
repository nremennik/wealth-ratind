package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table( name = "evaluate")
public class Evaluate
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "evaluatecity", nullable=false)
    private int evaluateCity;

    public Evaluate() {}


    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public int getEvaluateCity()
    {
        return evaluateCity;
    }

    public void setEvaluateCity(int evaluateCity)
    {
        this.evaluateCity = evaluateCity;
    }

    public Evaluate(String city, int evaluateCity)
    {
        this.city=city;
        this.evaluateCity=evaluateCity;


    }


}
