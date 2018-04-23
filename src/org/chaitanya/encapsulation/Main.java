package org.chaitanya.encapsulation;

public class Main {
    public static void main(String[] args){
        EnhancedPlayer enhancedPlayer=new EnhancedPlayer("dhoni",20,"ball");
        System.out.println("player details.."+enhancedPlayer.getHealth());
    }
}
