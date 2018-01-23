package org.chaitanya.composition;

public class Monitor {
    private String manufacturer;
    private String model;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String manufacturer, String model, int size, Resolution nativeResolution) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("drawing pixel at --"+ x +", "+y +"in color "+color);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

}
