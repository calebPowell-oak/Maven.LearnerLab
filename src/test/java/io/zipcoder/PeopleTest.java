package io.zipcoder;

import com.sun.org.apache.xpath.internal.operations.Bool;
import io.zipcoder.interfaces.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void add() {
        // Given
        People people = new People();
        Person dude = new Person(null, null);
        // When
        people.add(dude);
        Boolean actual = people.contains(dude);
        // Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void remove() {
        // Given
        Integer expectedCount = 0;
        People people = new People();
        Person chap = new Person(null, null);
        people.add(chap);
        // When
        people.remove(chap);
        Integer actualCount = people.count();
        // Assert
        Assert.assertTrue(expectedCount == actualCount);
    }

    @Test
    public void findById() {
        // Given
        Long id = 1234l;
        People people = new People();
        Person expected = new Person(id, null);
        people.add(expected);
        // When
        Person actual = people.findById(id);
        // Assert
        Assert.assertTrue(expected == actual);
    }
}