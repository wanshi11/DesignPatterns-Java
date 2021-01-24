package com.java.design.build.ws;


///抽象建造者：
public abstract class Builder {

    Product p = new Product();

    abstract void creatPartA();

    abstract void creatPartB();

    abstract void creatPartC();

    public Product getResult(){
        return p;
    }

}
