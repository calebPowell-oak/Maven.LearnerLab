package io.zipcoder;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    static {
        INSTANCE.add(new Student(0l, "Anish"));
        INSTANCE.add(new Student(1l, "Caleb"));
        INSTANCE.add(new Student(2l, "Robert"));
        INSTANCE.add(new Student(3l, "Bob"));
        INSTANCE.add(new Student(4l, "Prasanthi"));
        INSTANCE.add(new Student(5l, "Stefun"));
        INSTANCE.add(new Student(6l, "Ajulu"));
        INSTANCE.add(new Student(7l, "William"));
        INSTANCE.add(new Student(8l, "Edward"));
        INSTANCE.add(new Student(9l, "Erick"));
        INSTANCE.add(new Student(10l, "Andrew"));
        INSTANCE.add(new Student(11l, "Ben"));
        INSTANCE.add(new Student(12l, "Ben"));
        INSTANCE.add(new Student(13l, "Alex"));
        INSTANCE.add(new Student(14l, "Alex"));
        INSTANCE.add(new Student(15l, "Aashna"));
        INSTANCE.add(new Student(16l, "Sputnika"));
        INSTANCE.add(new Student(17l, "Alicia"));
        INSTANCE.add(new Student(18l, "Joanna"));
        INSTANCE.add(new Student(19l, "Donna"));
        INSTANCE.add(new Student(20l, "Angelica"));
        INSTANCE.add(new Student(21l, "Henry"));
        INSTANCE.add(new Student(22l, "Dan"));
        INSTANCE.add(new Student(23l, "Kavya"));
        INSTANCE.add(new Student(24l, "Dasha"));
        INSTANCE.add(new Student(25l, "Abram"));
        INSTANCE.add(new Student(26l, "Justin"));
        INSTANCE.add(new Student(27l, "Reese"));
        INSTANCE.add(new Student(28l, "x"));
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
