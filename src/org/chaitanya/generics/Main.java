package org.chaitanya.generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Integer> items=new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("tim");
        items.add(5);

        printDoubledItems(items);
    }

    public static void printDoubledItems(ArrayList<Integer> n){
        for (int i: n){
            System.out.println(i*2);
        }
    }

}
