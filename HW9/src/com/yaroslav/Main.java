package com.yaroslav;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double i = sc.nextDouble();
            double j = sc.nextDouble();
            if(j == 0){
            throw new ArithmeticException();}
            System.out.println(div(i, j));
        } catch (ArithmeticException aExp){
            System.out.println("Division by zero.");
        }
    }

    public static double div(double i, double j){
        return i/j;
    }
}
