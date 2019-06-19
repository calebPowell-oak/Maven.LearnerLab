package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;
import io.zipcoder.interfaces.Teacher;

public class Instructor extends Person implements Teacher {


    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for(Learner s : learners){
            s.learn(numberOfHours/learners.length);
        }
    }
}
