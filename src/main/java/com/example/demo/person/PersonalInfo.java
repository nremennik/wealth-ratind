package com.example.demo.person;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.Entity;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonalInfo
{

    private String firstName;
    private String lastName;
    private String city;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastname)
    {
        this.lastName = lastname;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }
}
