package io.zipcoder;

import io.zipcoder.Interfaces.Learner;

public class Student extends Person implements Learner {
    private Double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
        totalStudyTime = 0d;
    }

    public Student(Person p){
        super(p.getId(), p.getName());
        totalStudyTime = 0d;
    }

    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
