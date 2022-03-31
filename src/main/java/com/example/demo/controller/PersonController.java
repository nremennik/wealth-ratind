package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.exeptions.ResourceNotFoundExeption;
import com.example.demo.person.PersonRequest;
import com.example.demo.repo.PersonRepository;
import com.example.demo.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class PersonController
{

    @Autowired
    private RestService restService;

    @Autowired
    private PersonRepository clientRepository;

    @GetMapping("/person")
    public List<Person> getAllPersons()
    {
        return clientRepository.findAll();
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable long id)
    {
        Person person =clientRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundExeption("Client not exist with id "+id));
        return ResponseEntity.ok(person);
    }

    @PostMapping("/person")
    public Person checkUser(PersonRequest tempClient)
    {
        String city = tempClient.getPersonalInfo().getCity();
        double cash= tempClient.getFinancialInfo().getCash();
        double numberOfAssets = tempClient.getFinancialInfo().getNumberOfAssets();

        double assetPerCity = restService.getAsset(city);

        Double fortuneCurrent = cash + numberOfAssets * assetPerCity;
        Double fortune=restService.getWealthThreshold();
        if(fortuneCurrent>fortune)
        {
            Person client = new Person(tempClient.getId(),tempClient.getPersonalInfo().getFirstName(),tempClient.getPersonalInfo().getLastname(),fortuneCurrent);
            return clientRepository.save(client);

        }
        return null;
    }

}
