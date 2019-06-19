package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void constructorTest(){
        // Given
        Long id = 1001l;
        String name = "Caleb";
        // When
        Person person = new Person(id, name);
        String actualName = person.getName();
        Long actualId = person.getId();
        // Assert
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(id, actualId);
    }

    @Test
    public void setNameTest(){
        // Given
        String name = "AJ";
        Long id = 1234l;
        Person person = new Person(id, "Jojo");
        // When
        person.setName(name);
        String actualName = person.getName();
        // Assert
        Assert.assertEquals(name, actualName);
    }
}
