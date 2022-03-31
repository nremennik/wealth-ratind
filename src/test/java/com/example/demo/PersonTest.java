package com.example.demo;

import com.example.demo.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest
{
    public PersonTest()
    {
    }

    @Test
    public void testCreateClient()
    {
        Person c = new Person();
        assertNull(c.getId());
        assertNull(c.getFirstName());
        assertNull(c.getLastName());
        assertNull(c.getFortune());
    }

    @Test
    public void testCreateClientParam()
    {
        Person c = new Person(123l,"firstname","lastname",11111);
        assertEquals(123l, (long)c.getId());
        assertEquals("firstname", c.getFirstName());
        assertEquals("lastname", c.getLastName());
        assertEquals(11111, c.getFortune());

    }

    @Test
    public void testSetFirstname()
    {
        Person c = new Person();
        c.setFirstName("value");
        assertEquals("value", c.getFirstName());
    }

    @Test
    public void testSetLastname()
    {
        Person c = new Person();
        c.setLastName("value");
        assertEquals("value", c.getLastName());
    }

    @Test
    public void testSetFortune()
    {
        Person c = new Person();
        c.setFortune(11111.0);
        assertEquals("value", c.getFortune());
    }

    @Test
    public void testSetInn()
    {
        Person c = new Person();
        c.setId(1234567890l);
        assertEquals(1234567890l, (long) c.getId());
    }

    @Test
    public void testIsMandatorySet()
    {
        Person c = new Person(1234l, "Fred", "Lucky", 11111);
        assertTrue(c.isMandatorySet());
    }

}
