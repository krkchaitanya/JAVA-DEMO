package org.chaitanya.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[]args){
        LinkedList<String> placesToVisit=new LinkedList<String>();

        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Darwin");
        addInOrder(placesToVisit,"Adheleide");

        printList(placesToVisit);


        addInOrder(placesToVisit,"Alice springs");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);

        visit(placesToVisit);
    }


    private static void printList(LinkedList<String> linkedList){

        Iterator<String> i=linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting  "+i.next());
        }
        System.out.println("================");

    }


    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){

        ListIterator<String> stringListIterator=linkedList.listIterator();

        while(stringListIterator.hasNext()){
                int comparison=stringListIterator.next().compareTo(newCity);

                if(comparison==0){
                    //do not add
                    System.out.println(newCity +" is already included in the list");
                }else if (comparison >0){
                    stringListIterator.previous();
                    stringListIterator.add(newCity);
                    return true;
                }else if(comparison<0){
/*
stringListIterator.next();
stringListIterator.add(newCity);
*/

                }


        }
        stringListIterator.add(newCity);
        return true;
    }



    private static void visit(LinkedList cities){
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean goingForword=true;

        ListIterator<String> listIterator=cities.listIterator();

        if(cities.getFirst()==""){
            System.out.println("no cities in the itenery");
        }else{
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }


        while(!quit){
            int action=scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:{
                    System.out.println("holiday vacation over");
                    quit=true;
                    break;
                }
                case 1:{

                    if(!goingForword){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForword=true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("now visitong " + listIterator.next());
                    }else{
                        System.out.println("reached the end..");
                        goingForword=false;
                    }
                }
                break;
                case 2:{

                    if(goingForword){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForword=false;
                    }

                    if (listIterator.hasPrevious()){
                        System.out.println("now visiting..."+listIterator.previous());
                    }else {
                        System.out.println("we are at the atsrting of the list..");
                        goingForword=true;
                    }
                }
                break;
                case 3:{
                    printMenu();
                    break;
                }

            }
        }



    }


    private static void printMenu(){
        System.out.println("available actions----");
        System.out.println("0 -to quit");
        System.out.println("1- go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - print menu options");
    }





}
