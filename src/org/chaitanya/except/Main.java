package org.chaitanya.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){


        int z=newMethod();
        System.out.println("is valid or not--->"+z);


        System.out.println("-------------------");
        int x=34;
        int y=2;
        System.out.println(commonDivide(x,y));
        System.out.println("------------");
        System.out.println(excDivide(x,y));
    }

    private static int commonDivide(int x,int y){
        if(y!=0){
            return x/y;
        }
        else{
            return 0;
        }
    }

    private static int excDivide(int x,int y){
        try{
            return x/y;
        }catch(ArithmeticException e){
            return 0;
        }
    }

    private static int newMethod(){
        System.out.println("enter input from keyboard ----->");

        try{
            return scanner.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }

    }






}
