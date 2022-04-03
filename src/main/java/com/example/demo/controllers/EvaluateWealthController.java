package com.example.demo.controllers;

import com.example.demo.exeptions.ResourceNotFoundExeption;
import com.example.demo.models.Evaluate;
import com.example.demo.repositories.EvaluateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class EvaluateWealthController
{
    @Autowired
    EvaluateRepository repoS;

    @GetMapping("/central-bank/wealth-threshold")
    public int wealth()
    {
            return 50;
    }

    @GetMapping("/central-bank/regional-info/evaluate")
    public int evaluateCity(@RequestParam("city") String city)
    {

        Evaluate answer = repoS.findById(city).orElseThrow(
                ()->new ResourceNotFoundExeption("City: "+city+" not exist"));
        return answer.getEvaluateCity();
    }
}
