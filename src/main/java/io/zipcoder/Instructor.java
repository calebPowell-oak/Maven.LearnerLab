package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;
import io.zipcoder.interfaces.Teacher;

public class Instructor extends Person implements Teacher {


    public void teach(Learner learner, double numberOfHours) {

    }

    public void lecture(Learner[] learners, double numberOfHours) {
        Student[] students = new Student[3];
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
    }
}
