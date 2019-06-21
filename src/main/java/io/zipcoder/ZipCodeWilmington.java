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
        teacher.lecture((Learner[]) students.toArray(), hours);
    }

    public void hostLecture(Long id, Double hours){
        Student[] s = new Student[students.count()];
        for(int i = 0; i < students.count(); i++){
            s[i] = (Student)students.toArray()[i];
        }
        ((Instructor)instructors.findById(id)).lecture(s, hours);
    }

    public Map<Student, Double> getStudyMap(){
        Map<Student, Double> map = new HashMap<Student, Double>();
        for(Person student : students.toArray()){
            map.put((Student) student, ((Learner)student).getTotalStudyTime());
        }
        return map;
    }

}
