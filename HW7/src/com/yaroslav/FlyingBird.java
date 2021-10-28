package com.yaroslav;

public class FlyingBird extends Bird {
    FlyingBird(String feathers, int layEggs){
        super(feathers, layEggs);
    }
    @Override
    public void Fly() {
        System.out.println("This bird can fly!");
    }
}