package io.zipcoder;

import com.sun.deploy.perf.PerfRollup;

import java.util.ArrayList;
import java.util.List;

public abstract class People<E extends Person>{
    private List<E> personList = new ArrayList<E>();

    public void add(E p){
        personList.add(p);
    }

    public E findById(Long id){
        for(E p : personList){
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
        for(E p : personList){
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

    public List<E> getPersonList(){
        return personList;
    }

    public abstract E[] toArray();
}
