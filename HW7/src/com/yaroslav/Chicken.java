package com.yaroslav;

public class Chicken extends NonFlyingBird{
    Chicken(String feathers, int layEggs){
        super(feathers, layEggs);
    }

    @Override
    public String toString()
    {
        return "Feathers color is: " + feathers + "\nChicken layed eggs: " + layEggs;
    }
}
