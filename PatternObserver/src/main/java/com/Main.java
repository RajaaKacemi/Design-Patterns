package com;

import com.observer.ObservableImpl;
import com.observer.ObserverImpl1;
import com.observer.ObserverImpl2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();

        ObserverImpl1 observer1 = new ObserverImpl1();
        ObserverImpl2 observer2 = new ObserverImpl2();

        observable.subscribe(observer1);
        observable.subscribe(observer2);
        observable.setState(14);
        observable.setState(23);
    }
}