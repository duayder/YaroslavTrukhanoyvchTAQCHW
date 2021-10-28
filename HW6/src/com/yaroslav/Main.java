package com.yaroslav;

public class Main {

    public static void main(String[] args) {
        Kettle myKettle = new Kettle("Tefal", 6);
        Kettle myOtherKettle = new Kettle("Tefal", 6);

        System.out.println(myKettle.toString() + "\nThe water temperature is: " + myKettle.boilWater());
        System.out.println(myKettle.equals(myOtherKettle));
    }
}
