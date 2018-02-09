package org.chaitanya.dataStructures.queues;

public class Intq {

    private int[] queue;
    private int size;
    private int front;
    private int rear;
    private int total;


    public Intq(){
        size=100;
        front=0;
        rear=0;
        total=0;
        queue=new int[size];
    }

    public Intq(int size){
        this.size=size;
        front=0;
        rear=0;
        total=0;
        queue=new int[this.size];
    }

    public boolean enqueue(int item){
        if(!isFull()){
            total++;
            queue[rear]=item;
            rear++;
            return true;

        }else{
            return false;
        }
    }



    public int dequeue(){
        int item=queue[front];
        total--;
        front++;
        return item;
    }

    public boolean isFull(){

        if(size==total){
            return true;
        }else{
            return false;
        }

    }



}



