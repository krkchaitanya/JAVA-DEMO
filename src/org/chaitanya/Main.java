package org.chaitanya;


import org.chaitanya.classesContsructors.Account;
import org.chaitanya.classesContsructors.Car;
import org.chaitanya.composition.*;
import org.chaitanya.encapsulation.EnhancedPlayer;
import org.chaitanya.encapsulation.Player;
import org.chaitanya.inherit.Animal;
import org.chaitanya.inherit.Dog;
import org.chaitanya.polymorph.Movie;

import java.util.Scanner;


public class Main {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {





//        Car class
        org.chaitanya.classesContsructors.Car porsche=new org.chaitanya.classesContsructors.Car();
        org.chaitanya.classesContsructors.Car holden=new Car();
        porsche.setModel("someModel");
        System.out.println("model gonna be--"+porsche.getModel());


//        Account class
        Account oneAcc=new Account("1234",0.00,"chaitanya","chai@email.com","12341231234");

        oneAcc.deposit(220.00);
        System.out.println(oneAcc.getBalance());
        oneAcc.withdraw(220.00);
        System.out.println(oneAcc.getBalance());

//        Animal class
        Animal animal=new Animal("Animal",1,1,5,5);

        Dog dog=new Dog("Yorkie",8,20,2,4,1,4,20,20,"long silky");

        System.out.println("dog coat--"+dog.getCoat());
        System.out.println("animal name  "+animal.getName());

        dog.chewing();


//        folder data ..case
        Dimensions dimensions=new Dimensions(22,44,11);
        Case theCase=new Case("220B","dell","240",dimensions);

        Monitor theMonitor=new Monitor("27inch beast","acer",27,new Resolution(2540,1440));

        Motherboard theMotherboard=new Motherboard("BJ-200","Asus",4,4,"v2.44");

        PC thePc=new PC(theCase,theMonitor,theMotherboard);

        thePc.getMonitor().drawPixelAt(1500,1200,"red");
        thePc.getMotherboard().loadProgram("windows10");
        thePc.getTheCase().pressPowerButton();



//        ENCAPSULATION .................

//        Player player=new Player();
//        player.name="mike";
//        player.health=20;
//        player.weapon="sword";
//
//        int damage=10;
//        player.loseHealth(damage);
//        System.out.println("........Encapsulation__Remaining health--"+player.healthRemaining());
//


        EnhancedPlayer enhancedPlayer=new EnhancedPlayer("tim",200,"knife");
        System.out.println("encapsulation.....gettingHealth---"+enhancedPlayer.getHealth());





//        ---------------------MOVIES------------------------MOVIES-----------------------
//
//
//
//        public static Movie randomMovie{
//
//            int randomNumber=(int) (Math.random()*5)+1;
//            System.out.println("random no generated is ---"+randomNumber);
//
//            switch (randomNumber){
//                case 1:{
//                    return new Jaws();
//                }
//            }
//
//
//        }


//        .........................ARRAYS --------------------------

        int[] myIntarray=new int[10];
        myIntarray[5]=50;

        double[] myDoublearray=new double[5];
        myDoublearray[4]=40;

        System.out.println("intarray-- "+myIntarray[5] +" mydoublearray-- "+myDoublearray[4]);


        int[] myArrayInt={1,2,3,4,5,6,7};
        System.out.println("myArrayInt-- "+myArrayInt[4]);

        int[] myDynArr=new int[10];

        for (int i=0;i<myDynArr.length;i++){
            myDynArr[i]=i*10;
        }

        printArray(myDynArr);




//-----------JAVA  _______  Array ---------------


            int[] myIntegers = getIntegers(5);
            for (int i = 0; i < myIntegers.length; i++) {
                System.out.println("Element " + i + "types was" + myIntegers[i]);
            }
        System.out.println("average of array gonna be_______ "+getAvg(myIntegers));







    }

//    get integers method

    public static int[] getIntegers(int number){
        System.out.println("enter "+ number+" integer values \r");
        int[] values=new int[number];
        for (int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }



//    print array method

    public static void printArray(int[] Array){
        for (int i=0;i<Array.length;i++){
            System.out.println("hey printarray method------ "+Array[i]);
        }
    }



//    get average method

    public static double getAvg(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum/ (double)array.length;
    }



}


