package com.hades.example.designpatterns.compound.combining.factory;

// 绿头鸭
public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
