package org.chaitanya.interfaces;

public class Deskphone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, deskphone doesnt have a powerButton");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("now ringing "+phoneNumber +" on dsskphone");
    }

    @Override
    public void answere() {
        if (isRinging){
            System.out.println("answering the deskphone");
            isRinging=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging=true;
            System.out.println("ring ring");
        }else{
            isRinging=false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
