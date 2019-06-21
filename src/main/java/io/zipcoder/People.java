package io.zipcoder;

import com.sun.deploy.perf.PerfRollup;

import java.util.ArrayList;
import java.util.List;

public class People {
    private List<Person> personList = new ArrayList<Person>();

    public void add(Person p){
        personList.add(p);
    }

    public Person findById(Long id){
        for(Person p : personList){
            if(id.equals(p.getId())){
                return p;
            }
        }
        return null;
    }

    public Boolean contains(Person p){
        return personList.contains(p);
    }

    public void remove(Person p){
        personList.remove(p);
    }

    public void remove(Long id){
        for(Person p : personList){
            if(id.equals(p.getId())){
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
}
