package com.example.demo.person;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonRequest
{
    private long id;
    private PersonalInfo personalInfo;
    private FinancialInfo financialInfo;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public PersonalInfo getPersonalInfo()
    {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo)
    {
        this.personalInfo = personalInfo;
    }

    public FinancialInfo getFinancialInfo()
    {
        return financialInfo;
    }

    public void setFinancialInfo(FinancialInfo financialInfo)
    {
        this.financialInfo = financialInfo;
    }

    @Override
    public String toString() {
        return "personalInfo{" +
                "id=" + id +
                ", firstName='" + personalInfo.getFirstName() + '\'' +
                ", lastname='" + personalInfo.getLastName() +
                ", city='" + personalInfo.getCity() +

                '}'+"financialInfo{" +
                ", cash='" + financialInfo.getCash() + '\'' +
                ", numberOfAssets='" + financialInfo.getNumberOfAssets()+'}';
    }
}
