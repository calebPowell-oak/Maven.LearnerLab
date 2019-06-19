package io.zipcoder;

import io.zipcoder.interfaces.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    private List<Person> personList = new ArrayList<Person>(0);

    public void add(Person p){

    }

    public Person findById(Long id){
        return null;
    }

    public Boolean contains(Person p){
        return null;
    }

    public void remove(Person r){

    }

    public void remove(Long id){

    }

    public void removeAll(){

    }

    public Integer count(){
        return null;
    }

    public Person[] toArray(){
        return null;
    }

    public Iterator<Person> iterator(){
        return null;
    }
}
