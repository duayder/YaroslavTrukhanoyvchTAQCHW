package com.yaroslav;

public class Swallow extends FlyingBird{ ;
    Swallow(String feathers, int layEggs){
        super(feathers, layEggs);
    }

    @Override
    public String toString()
    {
        return "Feathers color is: " + feathers + "\nSwallow layed eggs: " + layEggs;
    }
}
