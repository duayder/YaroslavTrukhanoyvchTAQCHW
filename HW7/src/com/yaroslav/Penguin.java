package com.yaroslav;

public class Penguin extends NonFlyingBird{
    public Penguin(String feathers, int layEggs)
    {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String toString()
    {
        return "Feathers color is: " + feathers + "\nPenguin layed eggs: " + layEggs;
    }
}
