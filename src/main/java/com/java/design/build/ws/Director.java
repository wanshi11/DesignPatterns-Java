package com.java.design.build.ws;

import java.sql.BatchUpdateException;


//指挥者
public class Director {

    private Builder builder;


    public Director(Builder b){
        this.builder = b;
    }

    public Product construct() {

        builder.creatPartA();
        builder.creatPartB();
        builder.creatPartC();
        return builder.getResult();
    }
}
