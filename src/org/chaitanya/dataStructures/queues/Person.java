package org.chaitanya.dataStructures.queues;

public class Person {

     private String name;
     private int rollno;

     public Person(String name, int rollno){
         this.name=name;
         this.rollno=rollno;
     }

     public String toString(){
         return "name "+this.name+" and roll no "+this.rollno;
     }

}
