package io.zipcoder;

import io.zipcoder.Interfaces.Learner;
import io.zipcoder.Interfaces.Teacher;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private final Students students = Students.getInstance();
    private final Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington(){
    }

    public static ZipCodeWilmington getINSTANCE(){
        return INSTANCE;
    }

    public void hostLecture(Instructor teacher, Double hours){
        instructors.findById(50l).lecture(students.toArray(), hours);
    }

    public void hostLecture(Long id, Double hours){
        instructors.findById(id).lecture(students.toArray(), hours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<Student, Double>();
        for(Student s : students.toArray()){
            studyMap.put(s, s.getTotalStudyTime());
        }
        return studyMap;
    }

}
