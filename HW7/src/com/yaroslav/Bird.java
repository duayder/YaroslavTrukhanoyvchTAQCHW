package com.yaroslav;

public abstract class Bird {
    protected String feathers;
    protected int layEggs;
    public abstract void Fly();

    public Bird(){}
    public Bird(String feathers, int layEggs)
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
}
