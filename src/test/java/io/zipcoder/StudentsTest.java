package io.zipcoder;

import com.sun.org.apache.xpath.internal.operations.Bool;
import io.zipcoder.interfaces.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {
    @Test
    public void singletonTestForClassmates(){
        // Given
        Person expected = Students.getInstance().findById(0l);
        // When
        Boolean actual = Students.getInstance().contains(expected);
        // Assert
        Assert.assertTrue(actual);
    }
}