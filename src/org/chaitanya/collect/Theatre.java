package org.chaitanya.collect;

import java.util.ArrayList;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats=new ArrayList<>();


    public Theatre(String theatreName, int numRows, int seatPerRow){
         this.theatreName=theatreName;

         int lastRow='A'+(numRows-1);

         for (char rows='A';rows<=lastRow;rows++){
             for(int seatNum=1;seatNum<=seatPerRow;seatNum++){
                 Seat seat=new Seat(row+String.format("%02d",seatNum));
                 seats.add(seat);
             }
         }


    }


    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNum){
        Seat requestSeat=null;
        for (Seat seat:seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                requestedSeat=seat;
                break;

            }
        }
        if(requestSeat==null){
            System.out.println("there is not seat "+ seatNumber);
            return false;
        }

        return requestedSeat.reserve();
    }



}
