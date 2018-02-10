package org.chaitanya.dataStructures.queues;

public class Main {

    public static void main(String[] args){

//        Intq q=new Intq();
//        q.enqueue(3);
//        q.enqueue(4);
//        q.enqueue(5);
//
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//
//
//        q.enqueue(12);
//        System.out.println("========");
//        System.out.println(q.dequeue());

        Person person1=new Person("jackson",123);
        Person person2=new Person("valyudam",321);

        Personq q=new Personq();
        q.enqueue(person1);
        q.enqueue(person2);

        q.showAll();

    }

}
