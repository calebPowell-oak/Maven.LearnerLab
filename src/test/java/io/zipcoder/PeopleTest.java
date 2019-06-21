package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void add() {
        // Given
        People p = new People();
        Integer prior = p.count();
        // When
        p.add(Person.randomPerson());
        Integer post = p.count();
        // Assert
        Assert.assertTrue(post > prior);

    }

    @Test
    public void findById() {
        // Given
        People p = new People();
        Person expected = Person.randomPerson();
        p.add(expected);
        Long id = expected.getId();
        // When
        Person actual = p.findById(id);
        // Assert
        Assert.assertTrue(expected == actual);
    }

    @Test
    public void remove() {
        // Given
        People p = new People();
        Person person = Person.randomPerson();
        p.add(person);
        // When
        p.remove(person);
        Integer post = p.count();
        // Assert
        Assert.assertTrue(post == 0);
    }
}