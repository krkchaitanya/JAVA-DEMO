package org.chaitanya.dataStructures;

public class Main {
    public static void main(String[] args){

//        IntStack  intStack= new IntStack();
//        if(!intStack.isFull()){
//            intStack.push(2);
//            intStack.push(3);
//            intStack.push(4);
//            intStack.push(5);
//            intStack.push(6);
//        }
//        System.out.println(intStack.pop());

        Person person1=new Person("umir","1234");
        Person person2=new Person("chaitanya","3214");

        PersonStack personStack=new PersonStack();

        personStack.push(person1);
        personStack.push(person2);

        System.out.println(personStack.pop().toString() );
        System.out.println(personStack.pop().toString() );

    }
}
