package com.java.design.build.ws;

//具体建造者 继承 抽象建造者
public class ConcreteBuilder extends Builder {

    @Override
    void creatPartA() {
        p.setPartA("A");
    }

    @Override
    void creatPartB() {
        p.setPartB("B");
    }

    @Override
    void creatPartC() {
        p.setPartC("C");
    }
}
