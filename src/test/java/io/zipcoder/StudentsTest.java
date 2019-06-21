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
        // When
        Person actual = Students.getInstance().findById(0l);
        // Assert
        Assert.assertEquals("Anish", actual.getName());
    }

    @Test
    public void singletonTestForClassmates2(){
        // Given
        // When
        Person actual = Students.getInstance().findById(1l);
        // Assert
        Assert.assertEquals("Caleb", actual.getName());
    }

    @Test
    public void singletonTestForClassmates3(){
        // Given
        // When
        Person actual = Students.getInstance().findById(28l);
        // Assert
        Assert.assertEquals("x", actual.getName());
    }
}