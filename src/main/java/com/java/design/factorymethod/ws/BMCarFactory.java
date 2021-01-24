package com.java.design.factorymethod.ws;

public class BMCarFactory implements ICarFactory {
    @Override
    public ICar create() {
        System.out.println("BMCarFactory create BMCar ...");
        return new BMCar();
    }
}
