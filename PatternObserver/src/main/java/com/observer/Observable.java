package com.observer;

public interface Observable {
    void subscribe(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

    void setState(int state);
    int getState();
}
