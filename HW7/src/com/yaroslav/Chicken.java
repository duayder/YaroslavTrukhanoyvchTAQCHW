package com.yaroslav;

public class Chicken extends NonFlyingBird{
    public Chicken(String feathers, int layEggs)
    {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String toString()
    {
        return "Feathers color is: " + feathers + "\nChicken layed eggs: " + layEggs;
    }
}
