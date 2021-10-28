package com.yaroslav;

public class Swallow extends FlyingBird{ ;
    public Swallow(String feathers, int layEggs)
    {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String toString()
    {
        return "Feathers color is: " + feathers + "\nSwallow layed eggs: " + layEggs;
    }
}
