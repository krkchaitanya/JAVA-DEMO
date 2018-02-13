package org.chaitanya.collect;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Theatre theatre=new Theatre("olympian",8,12);
        List<Theatre.Seat> seatCopy=new ArrayList<>(theatre.seats);
        printList(seatCopy);


        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")){
            System.out.println("plz py for the seat..A02");
        }else{
            System.out.println("seat alredy reserved");
        }
    }

        public static void printList(List<Theatre.Seat> list) {
            for (Theatre.Seat seat : list) {
                System.out.print(" " + seat.getSeatNumber());
            }
            System.out.println();
            System.out.println("=============================================");
        }

}
