package org.chaitanya.interfaces;

public class Gearbox {

    private boolean clutchIsIn;

    public void Gearbox(String inOrOut){
        this.clutchIsIn=inOrOut.equalsIgnoreCase("in");
    }





}
