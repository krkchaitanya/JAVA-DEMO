package org.chaitanya.innerClasses;

public class Main {
    public static void main(String[] args){

        Gearbox mcLane=new Gearbox(6);
        Gearbox.Gear first=mcLane.new Gear(1,12.3);
        Gearbox.Gear second=mcLane.new Gear(2,15.3);
        System.out.println(first.driveSpeed(1000));
        System.out.println("------");
        System.out.println(second.driveSpeed(1200));

    }
}
