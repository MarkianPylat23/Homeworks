package com.cursor.hw10.car.builder;

public class CarBuilder {
    private String name;
    private String model;
    private String audio;
    private int wheelsAmount;

    public CarBuilder createName(String name) {
        this.name = name;
        return this;
    }

    public CarBuilder createModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder createAudio(String audio) {
        this.audio = audio;
        return this;
    }

    public CarBuilder createWheels(int wheels) {
        this.wheelsAmount = wheels;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setName(name);
        car.setModel(model);
        car.setAudio(audio);
        car.setWheels(wheelsAmount);
        return car;
    }
}
