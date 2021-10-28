package com.yaroslav;

public class Eagle extends FlyingBird{
    Eagle(String feathers, int layEggs){
        super(feathers, layEggs);
    }

    @Override
    public String toString()
    {
        return "Feathers color is: " + feathers + "\nEagle layed eggs: " + layEggs;
    }
}
