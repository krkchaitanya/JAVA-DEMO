package org.chaitanya.innerClasses;

public class Main {
    public static void main(String[] args){

        Gearbox mcLane=new Gearbox(6);

        mcLane.addGear(1, 5.3);
        mcLane.addGear(2,10.6);
        mcLane.addGear(3,15.5);

        mcLane.operateClutch(true);

        mcLane.changeGear(1);
        mcLane.operateClutch(false);
        System.out.println(mcLane.wheelSpeed(1000));
        mcLane.changeGear(2);
        System.out.println(mcLane.wheelSpeed(1200));


    }
}
