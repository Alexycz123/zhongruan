package com.ycz.pojo;/*
 @author ycz
 @date 2021-09-16-16:23  
*/

import java.util.List;

public class Person {

    private String name;

    public  List<Pet> petList;

    public String getName() {
        return name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", petList=" + petList +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, List<Pet> petList) {
        this.name = name;
        this.petList = petList;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    public void feed(){
        for (int i = 0; i < this.petList.size(); i++) {
            System.out.print(name+"喂养"+petList.get(i).getName());
            petList.get(i).eat();
        }
    }
}
