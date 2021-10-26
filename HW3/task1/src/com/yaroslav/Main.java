package com.yaroslav;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area;
        double perimeter;

        System.out.println("Enter the circle radius: ");
        double r = sc.nextDouble();

        while (r <= 0)
        {
            System.out.println("Enter the positive number: ");
            r = sc.nextDouble();
        }

        perimeter = Math.PI * 2 * r;
        area = Math.PI * (r * r);

        System.out.println("The area of a circle is " + area);
        System.out.println("The perimeter of a circle is " + perimeter);
    }
}
