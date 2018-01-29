package org.chaitanya.interfaces;

public class Mobilephone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public Mobilephone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn=true;
        System.out.println("Mobilephone powered on");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("now ringing " + phoneNumber + " on mobilephone");
        }else {
            System.out.println("phone is switched off");
        }
    }

    @Override
    public void answere() {
        if (isRinging){
            System.out.println("answering the mobilephone");
            isRinging=false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber&& isOn){
            isRinging=true;
            System.out.println("Melody playing");
        }else{
            isRinging=false;
            System.out.println("mobile phone not on");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
