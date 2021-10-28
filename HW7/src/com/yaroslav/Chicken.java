package com.yaroslav;

public class Chicken extends NonFlyingBird{
    private String feathers;
    private int layEggs;

    public Chicken(String feathers, int layEggs)
    {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers){
        this.feathers = feathers;
    }

    public int getLayEggs(){
        return layEggs;
    }

    public void setLayEggs(int layEggs){
        this.layEggs = layEggs;
    }

    @Override
    public String toString()
    {
        return "Feathers color is: " + feathers + "\nChicken layed eggs: " + layEggs;
    }
}
