package io.zipcoder;

import io.zipcoder.Interfaces.Learner;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void learn() {
        // Given
        Double hours = 100d;
        Student s = new Student(Person.randomPerson());
        Double prior = s.getTotalStudyTime();
        // When
        s.learn(hours);
        Double post = s.getTotalStudyTime();
        // Assert
        Assert.assertEquals(prior + hours, post, 0.00001);
    }

    @Test
    public void getTotalStudyTime() {
        // Given
        Student s = new Student(Person.randomPerson());
        // When
        Double actual = s.getTotalStudyTime();
        // Assert
        Assert.assertEquals(0d, actual, 0.00001);
    }

    @Test
    public void testImplementation(){
        // Given
        Student test = new Student(Person.randomPerson());
        // When
        Boolean actual = test instanceof Learner;
        // Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance(){
        // Given
        Student test = new Student(Person.randomPerson());
        // When
        Boolean actual = test instanceof Person;
        // Assert
        Assert.assertTrue(actual);
    }
}