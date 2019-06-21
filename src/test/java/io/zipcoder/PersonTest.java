package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void constructorTest() {
        // Given
        String xName = "j";
        long xId = 13l;
        // When
        Person test = new Person(xId, xName);
        // Assert
        Assert.assertTrue(xName.equals(test.getName()));
        Assert.assertTrue(xId == test.getId());
    }

    @Test
    public void setNameTest(){
        // Given
        String xName = "Ben";
        Person test = Person.randomPerson();
        // When
        test.setName(xName);
        // Assert
        Assert.assertTrue(xName.equals(test.getName()));
    }
}