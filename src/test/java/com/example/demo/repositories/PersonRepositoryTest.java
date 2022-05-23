package com.example.demo.repositories;

import com.example.demo.models.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class PersonRepositoryTest
{

    @Autowired
    PersonRepository underTest;

    @AfterEach
    void tearDown()
    {
        underTest.deleteAll();
    }

    @Test
    void selectExistPerson()
    {
        // given

        Person person = new Person("TestFirstName", "TestLastName", 100);
        underTest.save(person);

        //when
        boolean exists = underTest.selectExistPersons(100);
        //then
        assertThat(exists).isTrue();
    }

    @Test
    void selectNotExistPerson()
    {
        // given
        double fortune=1000000;
        //when
        boolean exists = underTest.selectExistPersons(fortune);
        //then
        assertThat(exists).isFalse();
    }
}