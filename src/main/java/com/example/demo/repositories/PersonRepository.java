package com.example.demo.repositories;
import com.example.demo.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Long>
{
    @Query("select case when count (p)>0 then " +
            "true else false end " +
            "from Person p where p.fortune>=?1")
    boolean selectExistPersons(double fortune);

}
