package com.java.design.proxy.ws;

public class ProxyCat implements Cat {

    private BlackCat blackCat;

    public ProxyCat(){
        if (blackCat == null) {
            blackCat = new BlackCat();
        }
    }

    @Override
    public void eat() {

        beforeEat();
        blackCat.eat();
        afterEat();

    }

    private void afterEat() {
        System.out.println("afterEat 散步。。。。");
    }

    private void beforeEat() {
        System.out.println("beforeEat 起床。。。。");
    }


}
