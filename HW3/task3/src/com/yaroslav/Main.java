package com.yaroslav;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1, c2, c3;
        int t1, t2, t3;
        int tc1, tc2, tc3;
        int totalCost, totalTime;

        System.out.println("How much does Call 1 cost per Minute?");
        c1 = sc.nextInt();
        while (c1 < 0)
        {
            System.out.println("Please enter positive number");
            c1 = sc.nextInt();
        }

        System.out.println("How much does Call 2 cost per Minute?");
        c2 = sc.nextInt();
        while (c2 < 0)
        {
            System.out.println("Please enter positive number");
            c2 = sc.nextInt();
        }

        System.out.println("How much does Call 3 cost per Minute?");
        c3 = sc.nextInt();
        while (c3 < 0)
        {
            System.out.println("Please enter positive number");
            c3 = sc.nextInt();
        }

        System.out.println("How much does Call 1 last?");
        t1 = sc.nextInt();
        while (t1 < 0)
        {
            System.out.println("Please enter positive number");
            t1 = sc.nextInt();
        }

        System.out.println("How much does Call 2 last?");
        t2 = sc.nextInt();
        while (t2 < 0)
        {
            System.out.println("Please enter positive number");
            t2 = sc.nextInt();
        }

        System.out.println("How much does Call 3 last?");
        t3 = sc.nextInt();
        while (t3 < 0)
        {
            System.out.println("Please enter positive number");
            t3 = sc.nextInt();
        }

        tc1 = t1 * c1;
        tc2 = t2 * c2;
        tc3 = t3 * c3;

        totalCost = tc1 + tc2 + tc3;
        totalTime = t1 + t2 + t3;

        System.out.println("Call 1 lasted for " + t1 + " minute(s). It costs " + tc1 +"\n" +
                "Call 2 lasted for " + t2 + " minute(s). It costs " + tc2 +"\n" +
                "Call 3 lasted for " + t3 + " minute(s). It costs " + tc3 +"\n" +
                "All calls lasted for total of " + totalTime + " minute(s). They cost " + totalCost);
    }
}
