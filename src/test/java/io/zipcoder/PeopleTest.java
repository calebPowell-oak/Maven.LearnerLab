package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void add() {
        // Given
        People<Student> p = Students.getInstance();
        Integer prior = p.count();
        // When
        p.add(new Student(Person.randomPerson()));
        Integer post = p.count();
        // Assert
        Assert.assertTrue(post > prior);

    }

    @Test
    public void findById() {
        // Given
        People<Student> p = Students.getInstance();
        Student expected = new Student(Person.randomPerson());
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
        People<Student> p = Students.getInstance();
        Student expected = new Student(Person.randomPerson());
        Integer prior = p.count();
        p.add(expected);
        // When
        p.remove(expected);
        Integer post = p.count();
        // Assert
        Assert.assertTrue(post == prior);
    }
}