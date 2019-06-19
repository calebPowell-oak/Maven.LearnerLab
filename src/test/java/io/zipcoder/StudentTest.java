package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;
import org.junit.Assert;
import org.junit.Test;
import sun.misc.Cleaner;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void learn() {
        // Given
        Student anish = new Student();
        double beforeLearning = anish.getTotalStudyTime();
        double hoursToStudy = 100;
        // When
        anish.learn(hoursToStudy);
        double actual = anish.getTotalStudyTime();
        // Assert
        Assert.assertEquals(beforeLearning + hoursToStudy, actual, 0.0001);
    }

    @Test
    public void testImplementation(){
        // Given
        Student student = new Student();
        // When
        Boolean actual = student instanceof Learner;
        // Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance(){
        // Given
        Student student = new Student();
        // When
        Boolean actual = student instanceof Person;
        // Assert
        Assert.assertTrue(actual);
    }
}