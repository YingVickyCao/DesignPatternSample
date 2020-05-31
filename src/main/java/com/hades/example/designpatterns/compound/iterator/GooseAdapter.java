package com.hades.example.designpatterns.compound.iterator;

public class GooseAdapter implements Quackable {
    Goose mGoose;

    public GooseAdapter(Goose goose) {
        mGoose = goose;
    }

    @Override
    public void quack() {
        mGoose.honk();
    }
}