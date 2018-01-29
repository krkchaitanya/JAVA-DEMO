package org.chaitanya.interfaces;

public class Main {
    public static void main(String[] args){

        ITelephone timsPhone;
        timsPhone=new Deskphone(123456);

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answere();
        timsPhone.isRinging();
        System.out.println("================");

        timsPhone=new Mobilephone(245678);
        timsPhone.powerOn();
        timsPhone.callPhone(245678);
        timsPhone.answere();


    }
}
