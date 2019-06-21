package io.zipcoder;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    static {
        INSTANCE.add(new Student(new Person(0l, "Caleb")));
        INSTANCE.add(new Student(new Person(1l, "Donna")));
        INSTANCE.add(new Student(new Person(2l, "Robert")));
    }

    private Students(){
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    public Student[] toArray() {
        return this.getPersonList().toArray(new Student[count()]);
    }
}
