package com.yaroslav;

public class NonFlyingBird extends Bird {
    NonFlyingBird(String feathers, int layEggs){
        super(feathers, layEggs);
    }
    @Override
    public void Fly() {
        System.out.println("This bird can not fly!");
    }
}