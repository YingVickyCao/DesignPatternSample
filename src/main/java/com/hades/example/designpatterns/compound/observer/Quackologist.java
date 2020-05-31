package com.hades.example.designpatterns.compound.observer;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable observable) {
        System.out.println("Quackologist: " + observable.getClass().getSimpleName() + " just quacked.");
    }
}
