package io.zipcoder;

import io.zipcoder.Interfaces.Teacher;
import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void teach() {
        // Given
        Instructor n = new Instructor(Person.randomPerson());
        Student s = new Student(Person.randomPerson());
        Double prior = s.getTotalStudyTime();
        Double hours = 10d;
        // When
        n.teach(s, hours);
        Double post = s.getTotalStudyTime();
        // Assert
        Assert.assertEquals(prior + hours, post, 0.00001);
    }

    @Test
    public void lecture() {
        // Given
        Instructor n = new Instructor(Person.randomPerson());
        Student[] s = {new Student(Person.randomPerson()), new Student(Person.randomPerson()), new Student(Person.randomPerson())};
        Double prior = s[0].getTotalStudyTime();
        Double hours = 10d;
        // When
        n.lecture(s, hours);
        Double post = s[0].getTotalStudyTime();
        // Assert
        Assert.assertEquals(prior + hours/s.length, post, 0.00001);
    }

    @Test
    public void testImplementation(){
        // Given
        Instructor n = new Instructor(Person.randomPerson());
        // When
        Boolean actual = n instanceof Teacher;
        // Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance(){
        // Given
        Instructor n = new Instructor(Person.randomPerson());
        // When
        Boolean actual = n instanceof Person;
        // Assert
        Assert.assertTrue(actual);
    }

}