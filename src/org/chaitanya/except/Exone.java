package org.chaitanya.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exone {

    public static void main(String[] args){

        makeDivide();

    }

    public static void makeDivide(){
        int x=getInt();
        int y=getInt();
        System.out.println("--------after division-----");
        int result =x/y;
        System.out.println(result);
    }



    private static int getInt(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("---enter number from keyboard----");
        while(true){
            try{
                return scanner.nextInt();
            }
            catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("..please enter a valid number between 0 to 9--");
            }
        }

    }
}
