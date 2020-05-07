package com.cursor.hw10.car.builder;

public class Car {
   private String name;
    private String model;
    private String audio;
    private int wheelsAmount;

    public void setName(String name) {

        this.name = name;
    }

    public void setModel(String model) {
        
        this.model = model;
    }

    public void setAudio(String audio) {
        
        this.audio = audio;
    }

    public void setWheels(int wheels) {
        this.wheelsAmount = wheels;
    }

    @Override
    public String toString() {
        return ("New Car: \n Name: " + name + "\n Model: " + model +
                "\n Audio: " + audio + "\n Wheels: " + wheelsAmount);
    }
}