package com.yaroslav;

public class Penguin extends NonFlyingBird{
    Penguin(String feathers, int layEggs){
        super(feathers, layEggs);
    }

    @Override
    public String toString()
    {
        return "Feathers color is: " + feathers + "\nPenguin layed eggs: " + layEggs;
    }
}
