package com.java.design.factorymethod.ws;

import java.sql.SQLOutput;

public class BCCarFactory implements ICarFactory {

    @Override
    public ICar create() {
        System.out.println("BCCarFactory create BCCar ...");
        return new BCCar();
    }
}
