package io.zipcoder;

import io.zipcoder.interfaces.Person;
import io.zipcoder.interfaces.Teacher;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void teach() {
        // Given
        Instructor instructor = new Instructor();
        Student student = new Student();
        double hoursToTeach = 100;
        double hoursBefore = student.getTotalStudyTime();
        // When
        instructor.teach(student, hoursToTeach);
        double actual = student.getTotalStudyTime();
        // Assert
        Assert.assertTrue(hoursBefore + hoursToTeach ==  actual);
    }

    @Test
    public void lecture() {
        // Given
        Instructor instructor = new Instructor();
        Student student1 = new Student();
        Student student2 = new Student();
        Student[] classArr = {student1, student2};
        double hoursToTeach = 100;
        ArrayList<Double> totalStudyHours = new ArrayList<Double>();
        for(Student x : classArr) totalStudyHours.add(x.getTotalStudyTime());
        // When
        instructor.lecture(classArr, hoursToTeach);
        ArrayList<Double>  totalHoursAfterLecture = new ArrayList<Double>();
        for(Student x : classArr) totalHoursAfterLecture.add(x.getTotalStudyTime());
        // Assert
        Assert.assertTrue(
                totalStudyHours.get(0) + hoursToTeach/classArr.length == totalHoursAfterLecture.get(0));
    }

    @Test
    public void testImplementation(){
        // Given
        Instructor instructor = new Instructor();
        // When
        Boolean actual = instructor instanceof Teacher;
        // Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void testInheritance(){
        // Given
        Instructor instructor = new Instructor();
        // When
        Boolean actual = instructor instanceof Person;
        // Assert
        Assert.assertTrue(actual);
    }
}