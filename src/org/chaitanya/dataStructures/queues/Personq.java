package org.chaitanya.dataStructures.queues;

public class Personq {

     private Person[] q;
     private int front;
     private int rear;
     private int total;
     private int size;

     public Personq(){
         front=0;
         rear=0;
         total=0;
         size=100;
         q=new Person[this.size];
     }

     public Personq(int size){
         this.size=size;
         front=0;
         rear=0;
         total=0;
         q=new Person[this.size];
     }


     public boolean enqueue(Person item){
         if(isFull()){
             return false;
         }else{
             total++;
             q[rear]=item;
             rear=(rear+1) % size;
             return true;
         }
     }

     public boolean isFull(){
         if(size==total){
             return true;
         }else{
              return false;
         }
     }


     public Person dequeue(){
         Person item=q[front];
         front=(front +1) % size;
         return item;
     }


     public void showAll(){
         int f=front;

         if(total!=0){
             for(int i=0;i<total;i++){
                 System.out.println(" "+q[f].toString());
                 f=(f+1) % size;
             }
         }
     }



}
