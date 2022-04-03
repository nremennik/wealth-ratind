package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table( name = "persons")
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "firstname", nullable=false)
    private String firstName;
    @Column(name = "lastname", nullable=false)
    private String lastName;
    @Column(name = "fortune", nullable=false)
    private Double fortune;

    public Person(){}
    public Person(String firstName, String lastName, double fortune)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.fortune=fortune;
    }

    public Long getId()
    {
        return id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }
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

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Double getFortune()
    {
        return fortune;
    }

    public void setFortune(Double fortune)
    {
        this.fortune = fortune;
    }

    @Transient
    public boolean isMandatorySet()
    {
        return getId() != null && getFirstName() != null &&
                getLastName() != null &&
                getFortune() != null;
    }
}
