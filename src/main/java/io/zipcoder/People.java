package io.zipcoder;

import io.zipcoder.interfaces.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class People implements Iterable<Person> {
    private List<Person> personList = new ArrayList<Person>(0);

    public void add(Person p){
        personList.add(p);
    }

    public Person findById(Long id){
        for(Person p : personList){
            if(p.getId().equals(id))return p;
        }
        return null;
    }

    public Boolean contains(Person s){
        for(Person p : personList){
            if(p == s)return true;
        }
        return false;
    }

    public void remove(Person r){
        for(Person p : personList){
            if(p == r){
                personList.remove(r);
                return;
            }
        }
    }

    public void remove(Long id){
        for(Person p : personList){
            if(p.getId().equals(id)){
                personList.remove(p);
                return;
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[personList.size()]);
    }

    public Iterator<Person> iterator(){
        return new PeopleIterator();
    }

    private class PeopleIterator implements Iterator<Person> {
        private Integer count = 0;

        public boolean hasNext() {
            if(count < personList.size()) return true;
            return false;
        }

        public Person next() {
            if(!hasNext()) throw new NoSuchElementException();
            return personList.get(count++);
        }

        public void remove() {
            personList.remove(count);
        }
    }
}
