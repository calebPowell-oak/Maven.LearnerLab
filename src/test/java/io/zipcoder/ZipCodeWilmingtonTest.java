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
        Map<Student, Double> studyMap = cohort.getStudyMap();
        Double hours = 100d;
        Double prior = studyMap.get(students.findById(0l));
        // When
        cohort.hostLecture(50l, hours);
        Double post = studyMap.get(students.findById(0l));
        // Assert
        Assert.assertTrue(post > prior);

    }
}
