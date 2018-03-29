package org.chaitanya.Account;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public void setModel(String model){
        String validModel=model.toLowerCase();
        if(validModel.equals("baseModel")){
            this.model=model;
        }else{
            this.model="unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}

