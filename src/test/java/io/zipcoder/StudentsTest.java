package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {
    @Test
    public void testStudents(){
        // Given
        Students students = Students.getInstance();
        Person caleb = students.findById(0l);
        Person donna = students.findById(1l);
        Person robert = students.findById(2l);
        // When
        Boolean containsCaleb = students.contains(caleb);
        Boolean containsDonna = students.contains(donna);
        Boolean containsRobert = students.contains(robert);
        // Assert
        Assert.assertTrue(containsCaleb && containsDonna && containsRobert);
    }
}
