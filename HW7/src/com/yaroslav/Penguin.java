package com.yaroslav;

public class Penguin extends NonFlyingBird{
    private String feathers;
    private int layEggs;

    public Penguin(String feathers, int layEggs)
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
        return "Feathers color is: " + feathers + "\nPenguin layed eggs: " + layEggs;
    }
}
