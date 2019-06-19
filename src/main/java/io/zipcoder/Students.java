package io.zipcoder;

import io.zipcoder.interfaces.Person;

public final class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students(){
        INSTANCE.add(new Person(0l, "Anish"));
        INSTANCE.add(new Person(1l, "Caleb"));
        INSTANCE.add(new Person(2l, "Robert"));
        INSTANCE.add(new Person(3l, "Bob"));
        INSTANCE.add(new Person(4l, "Prasanthi"));
        INSTANCE.add(new Person(5l, "Stefun"));
        INSTANCE.add(new Person(6l, "Ajulu"));
        INSTANCE.add(new Person(7l, "William"));
        INSTANCE.add(new Person(8l, "Edward"));
        INSTANCE.add(new Person(9l, "Erick"));
        INSTANCE.add(new Person(10l, "Andrew"));
        INSTANCE.add(new Person(11l, "Ben"));
        INSTANCE.add(new Person(12l, "Ben"));
        INSTANCE.add(new Person(13l, "Alex"));
        INSTANCE.add(new Person(14l, "Alex"));
        INSTANCE.add(new Person(15l, "Aashna"));
        INSTANCE.add(new Person(16l, "Sputnika"));
        INSTANCE.add(new Person(17l, "Alicia"));
        INSTANCE.add(new Person(18l, "Joanna"));
        INSTANCE.add(new Person(19l, "Donna"));
        INSTANCE.add(new Person(20l, "Angelica"));
        INSTANCE.add(new Person(21l, "Henry"));
        INSTANCE.add(new Person(22l, "Dan"));
        INSTANCE.add(new Person(23l, "Kavya"));
        INSTANCE.add(new Person(24l, "Dasha"));
        INSTANCE.add(new Person(25l, "Abram"));
        INSTANCE.add(new Person(26l, "Justin"));
        INSTANCE.add(new Person(27l, "Reese"));
        INSTANCE.add(new Person(28l, "x"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}
