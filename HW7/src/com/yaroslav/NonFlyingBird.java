package com.yaroslav;

public class NonFlyingBird extends Bird {
    @Override
    public void Fly() {
        System.out.println("This bird can not fly!");
    }
}