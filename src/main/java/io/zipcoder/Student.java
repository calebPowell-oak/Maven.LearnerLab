package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;

public class Student extends Person implements Learner {
    private Double totalStudyTime;

    public void learn(double numberOfHours) {
    }

    public Double getTotalStudyTime() {
        return null;
    }

    public Double anotherMethod() {
        return null;
    }
}
