package com.hades.example.designpatterns.compound.composite;

// 绿头鸭
public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
