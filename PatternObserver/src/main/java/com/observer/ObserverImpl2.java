package com.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer{
    private List<Double> history = new ArrayList<>();
    @Override
    public void update(int state) {
        System.out.println("********* Observable Implementation 2 ************");
        history.add(Double.valueOf(state));
        System.out.println("***************************************************");
    }
}
