package com.hades.example.designpatterns.compound.combining.adapter;

// 红头鸭
public class RedheadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
