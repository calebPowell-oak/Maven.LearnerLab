package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {
    @Test
    public void testInstructors1(){
         // Given
        Instructors i = Instructors.getInstance();
        // When
        String actual = i.findById(50l).getName();
        // Assert
        Assert.assertEquals("Kris", actual);
    }

    @Test
    public void testInstructors2(){
        // Given
        Instructors i = Instructors.getInstance();
        // When
        String actual = i.findById(51l).getName();
        // Assert
        Assert.assertEquals("Dolio", actual);
    }

    @Test
    public void testInstructors3(){
        // Given
        Instructors i = Instructors.getInstance();
        // When
        String actual = i.findById(52l).getName();
        // Assert
        Assert.assertEquals("Wilhem", actual);
    }
}
