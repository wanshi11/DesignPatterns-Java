package com.java.design.factorymethod.ws;

public class FactroyMethod {


    public static void main(String[] args) {

        BMCarFactory bmCarFactory = new BMCarFactory();
        ICar bmCar = bmCarFactory.create();
        bmCar.run();

        BCCarFactory bcCarFactory = new BCCarFactory();
        ICar bcCar = bcCarFactory.create();
        bcCar.run();



    }



}
