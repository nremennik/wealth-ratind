package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table( name = "wealth_threshold")
public class WealthThreshold
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "wealth", nullable=false)
    private int wealth;

    public WealthThreshold() {}


    public WealthThreshold(int id, int wealth)
    {
        this.id=id;
        this.wealth=wealth;


    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getWealth()
    {
        return wealth;
    }

    public void setWealth(int wealth)
    {
        this.wealth = wealth;
    }
}
