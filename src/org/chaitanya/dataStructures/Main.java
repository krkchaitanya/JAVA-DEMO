package org.chaitanya.dataStructures;

public class Main {
    public static void main(String[] args){

        IntStack  intStack= new IntStack();
        if(!intStack.isFull()){
            intStack.push(2);
            intStack.push(3);
            intStack.push(4);
            intStack.push(5);
            intStack.push(6);
        }
        System.out.println(intStack.pop());
    }
}
