package io.zipcoder;

import java.util.Random;

public class Person {
    private final long id;
    private String name;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Person[] randomIdPerson(Integer q){
        Random random = new Random();
        Person[] r = new Person[q];
        for(int i = 0; i < r.length; i++){
            r[i] = new Person((long)random.nextInt(100000), null);
        }
        return r;
    }

    public static Person randomPerson(){
        Random r = new Random();
        return new Person((long)r.nextInt(100000), null);
    }
}
