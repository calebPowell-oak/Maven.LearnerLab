package io.zipcoder;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;
import io.zipcoder.interfaces.Teacher;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    private static Students sref = Students.getInstance();
    private static Instructors iref = Instructors.getInstance();
    private static Learner[] larr = sref.toArray();

    public static void hostLecture(Teacher teacher, Double numberOfHours){
        teacher.lecture((Learner[])sref.toArray(), numberOfHours);
    }

    public static void hostLecture(Long id, Double numberOfHours){
        ((Instructor)iref.findById(id)).lecture((Learner[])sref.toArray(), numberOfHours);
    }

    public static Map<Student, Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<Student, Double>();
        for(Person x : sref){
            studyMap.put((Student)x, ((Student) x).getTotalStudyTime());
        }
        return studyMap;
    }

    public static Students getStudents(){
        return sref;
    }

    public static Instructors getInstructors(){
        return iref;
    }
}
