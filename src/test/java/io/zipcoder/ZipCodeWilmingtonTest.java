package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ZipCodeWilmingtonTest {
    @Test
    public void testHostLecture(){
        // Given
        Double hours = 200.00;
        Double before = ((Student)ZipCodeWilmington.getStudents().findById(0l)).getTotalStudyTime();
        // When
        ZipCodeWilmington.hostLecture(50l, hours);
        Double actual = ((Student)ZipCodeWilmington.getStudents().findById(0l)).getTotalStudyTime();
        // Assert
        Assert.assertEquals(before + hours/ZipCodeWilmington.getStudents().size(), actual, 0.0001);
    }
}
