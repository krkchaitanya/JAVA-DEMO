package org.chaitanya;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.JavaWsdlMappingType;
import org.chaitanya.classesContsructors.Account;
import org.chaitanya.classesContsructors.Car;
import org.chaitanya.composition.*;
import org.chaitanya.encapsulation.EnhancedPlayer;
import org.chaitanya.encapsulation.Player;
import org.chaitanya.inherit.Animal;
import org.chaitanya.inherit.Dog;
import org.chaitanya.polymorph.Movie;

public class Main {

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



        public static Movie randomMovie{

            int randomNumber=(int) (Math.random()*5)+1;
            System.out.println("random no generated is ---"+randomNumber);

            switch (randomNumber){
                case 1:{
                    return new Jaws();
                }
            }


        }




    }
}


