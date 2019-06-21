package io.zipcoder;

import io.zipcoder.Interfaces.Learner;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();

    public void hostLecture(Instructor teacher, Double hours){
        teacher.lecture((Learner[]) students.toArray(), hours);
    }

    public void hostLecture(Long id, Double hours){
        ((Instructor)instructors.findById(id)).lecture((Learner[])students.toArray(), hours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> map = new HashMap<Student, Double>();
        for(Person student : students.toArray()){
            map.put((Student) student, ((Learner)student).getTotalStudyTime());
        }
        return map;
    }

}
