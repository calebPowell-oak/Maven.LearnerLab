package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ZipCodeWilmingtonTest {
    @Test
    public void testHostLecture(){
        // Given
        ZipCodeWilmington cohort = ZipCodeWilmington.getINSTANCE();
        Students students = Students.getInstance();
        Double prior = ((Student)students.findById(0l)).getTotalStudyTime();
        Double hours = 100d;
        // When
        cohort.hostLecture(50l, hours);
        Double post = ((Student)students.findById(0l)).getTotalStudyTime();
        // Assert
        Assert.assertTrue(post > prior);
    }
}
