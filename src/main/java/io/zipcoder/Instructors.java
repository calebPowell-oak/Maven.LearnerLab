package io.zipcoder;

public class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    static {
        INSTANCE.add(new Instructor(new Person(50l, "Kris")));
        INSTANCE.add(new Instructor(new Person(51l, "Dolio")));
        INSTANCE.add(new Instructor(new Person(52l, "Wilhem")));
        INSTANCE.add(new Instructor(new Person(53l, "Froilan")));
    }

    private Instructors(){}

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
