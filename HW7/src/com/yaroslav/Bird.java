package com.yaroslav;

public abstract class Bird {
    protected String feathers;
    protected int layEggs;
    public abstract void Fly();

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
