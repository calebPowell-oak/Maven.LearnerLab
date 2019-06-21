package io.zipcoder;

import io.zipcoder.Interfaces.Learner;
import io.zipcoder.Interfaces.Teacher;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name){
        super(id, name);
    }

    public Instructor(Person p){
        super(p.getId(), p.getName());
    }

    public void teach(Learner learner, Double hours) {
        learner.learn(hours);
    }

    public void lecture(Learner[] learners, Double hours) {
        for(Learner x : learners){
            x.learn(hours/learners.length);
        }
    }
}
