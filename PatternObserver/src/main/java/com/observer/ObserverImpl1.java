package com.observer;

public class ObserverImpl1 implements Observer{
    @Override
    public void update(int state) {
        System.out.println("********* Observable Implementation 1 ************");
        System.out.println("New state : " + state);
        System.out.println("***************************************************");
    }
}
