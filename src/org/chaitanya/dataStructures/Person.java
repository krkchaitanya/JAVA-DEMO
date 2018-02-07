package org.chaitanya.dataStructures;

public class Person {

    private String name;
    private String rollno;

    public Person(String name, String roolno) {
        this.name = name;
        this.rollno = roolno;
    }

    public String toString(){
        return "Name " +this.name+ " Roll no "+ this.rollno;
    }
}
