package com.hades.example.designpatterns.compound.combining.ducks;

// 绿头鸭
public class MallardDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
