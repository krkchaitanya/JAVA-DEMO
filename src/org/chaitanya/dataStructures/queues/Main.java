package org.chaitanya.dataStructures.queues;

public class Main {

    public static void main(String[] args){

        Intq q=new Intq();
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }

}
