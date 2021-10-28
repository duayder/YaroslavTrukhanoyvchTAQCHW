package com.yaroslav;

public class Eagle extends FlyingBird{
    public Eagle(String feathers, int layEggs)
    {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String toString()
    {
        return "Feathers color is: " + feathers + "\nEagle layed eggs: " + layEggs;
    }
}
