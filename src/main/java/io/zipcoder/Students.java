package io.zipcoder;

public class Students extends People {
    private static final Students INSTANCE = new Students();

    static {
        INSTANCE.add(new Student(new Person(0l, "Caleb")));
        INSTANCE.add(new Student(new Person(1l, "Donna")));
        INSTANCE.add(new Student(new Person(2l, "Robert")));
    }

    private Students(){
    }

    public Students getInstance(){
        return INSTANCE;
    }
}
