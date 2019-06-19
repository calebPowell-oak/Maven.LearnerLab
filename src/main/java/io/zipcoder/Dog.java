package io.zipcoder;

public class Dog extends Animal{
    String name;
    String owner;
    Integer age;

    public void speak(){
        System.out.println("Bark!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
