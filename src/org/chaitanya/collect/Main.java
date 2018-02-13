package org.chaitanya.collect;

public class Main {

    public static void main(String[] args){

        com.timbuchalka.Theatre theatre=new com.timbuchalka.Theatre("olympian",8,12);
        if(theatre.reserveSeat("H11")){
            System.out.println("please pay the amount..");
        }else{
            System.out.println("sorry seat is taken..");
        }


    }

}
