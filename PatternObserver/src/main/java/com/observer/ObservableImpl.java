package com.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    private int state;
    private List<Observer> observables = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observables.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observables.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observables){
            observer.update(state);
        }

    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public int getState() {
        return 0;
    }
}
