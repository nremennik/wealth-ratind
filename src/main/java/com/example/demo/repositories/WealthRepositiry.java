package com.example.demo.repositories;


import com.example.demo.models.WealthThreshold;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WealthRepositiry extends JpaRepository<WealthThreshold,Long>
{
}
