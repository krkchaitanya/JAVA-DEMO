package org.chaitanya;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight,int eyes,int legs,int tail,int teeth,String coat) {
        super(name, brain, body, size, weight);

        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    public void eat(){
        System.out.println("dog.eat()");
    }

    public void move(){
        System.out.println("dog.move()");
    }

    public void chewing(){
        super.chew();
        chew();
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public void chew(){
        System.out.println("dog.chew() method is called..");
    }

    public String getCoat() {
        return coat;
    }
}
