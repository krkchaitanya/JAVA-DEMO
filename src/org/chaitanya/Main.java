package org.chaitanya;

public class Main {

    public static void main(String[] args) {

//        Car class
        Car porsche=new Car();
        Car holden=new Car();
        porsche.setModel("someModel");
        System.out.println("model gonna be--"+porsche.getModel());


//        Account class
        Account oneAcc=new Account("1234",0.00,"chaitanya","chai@email.com","12341231234");

        oneAcc.deposit(220.00);
        System.out.println(oneAcc.getBalance());
        oneAcc.withdraw(220.00);
        System.out.println(oneAcc.getBalance());


    }
}
