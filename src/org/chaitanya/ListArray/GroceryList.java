package org.chaitanya.ListArray;

import java.util.ArrayList;

public class GroceryList {

    private int[] myNumbers=new int[50];
    private ArrayList<String> groceryList=new ArrayList<String>();

    public void addItem(String item){
        groceryList.add(item);
    }


    public void printItems(){
        System.out.println("we have "+groceryList.size()+"grocery items");
        for (int i=0;i<groceryList.size();i++){
            System.out.println("grocery item--"+groceryList.get(i));
        }
    }

    public void modifyItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("grocery item at position--"+(position+1));
    }

    public void removeItem(int position){
        String theItem=groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String item){
        int pos=groceryList.indexOf(item);
        if(pos>=0){
            return groceryList.get(pos);
        }
        return null;
    }


}
