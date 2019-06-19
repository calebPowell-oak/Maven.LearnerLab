package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;

public class Student extends Person implements Learner {
    private Double totalStudyTime;


    public Student(Long id, String name) {
        super(id, name);
    }

    public Student() {
        totalStudyTime = 0d;
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
