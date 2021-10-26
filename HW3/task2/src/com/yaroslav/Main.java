package com.yaroslav;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        String adress;

        System.out.println("What is your name?");
        name = sc.nextLine();

        System.out.println("Where do you live, " + name);
        adress = sc.nextLine();

        System.out.println("Your name is " + name + ". You live in " + adress);
    }
}
