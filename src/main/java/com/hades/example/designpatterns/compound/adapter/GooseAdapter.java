package com.hades.example.designpatterns.compound.adapter;

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