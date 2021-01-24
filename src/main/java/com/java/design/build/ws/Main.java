package com.java.design.build.ws;

public class Main {


    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();

        System.out.println(product.toString());
    }
}
