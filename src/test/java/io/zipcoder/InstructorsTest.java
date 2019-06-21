package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {
    @Test
    public void testInstructorsSingleton(){
        // Given
        Instructors instructors = Instructors.getInstance();
        Person kris = instructors.findById(50l);
        Person dolio = instructors.findById(51l);
        Person wilhem = instructors.findById(52l);
        Person froilan = instructors.findById(53l);
        // When
        Boolean containsKris = instructors.contains(kris);
        Boolean containsDolio = instructors.contains(dolio);
        Boolean containsWilhem = instructors.contains(wilhem);
        Boolean containsFroilan = instructors.contains(froilan);
        // Assert
        Assert.assertTrue(containsDolio && containsKris && containsWilhem && containsFroilan);
    }

    @Test
    public void testInstructorsSingleton2(){
        People<Student> p = Students.getInstance();
        System.out.println(p.toArray().toString());
    }
}
