package com.yaroslav;

public class Main {

    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("Brown", 3);
        birds[1] = new Swallow("Black and White", 5);
        birds[2] = new Chicken("Red", 15);
        birds[3] = new Penguin("Black", 1);

        for(int i = 0; i < birds.length; i++){
            System.out.println(birds[i].toString());
            birds[i].Fly();
        }
    }
}
