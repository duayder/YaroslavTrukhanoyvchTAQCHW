package com.yaroslav;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WILL THE BRICK PASS THROUGH THE HOLE?");

        System.out.println("Enter the brick length: ");
        int a = sc.nextInt();
        System.out.println("Enter the brick width and press ENTER: ");
        int b = sc.nextInt();
        System.out.println("Enter the brick height and press ENTER: ");
        int c = sc.nextInt();

        System.out.println("Enter the hole width and press ENTER: ");
        int x = sc.nextInt();
        System.out.println("Enter the hole height and press ENTER: ");
        int y = sc.nextInt();

        int[] params = {a, b, c};
        System.out.println(params.toString());

        if (a > 0 && b > 0 && c > 0 && x > 0 && y > 0)
        {

            if (a <= x)
            {
                if (b <= y || c <= y)
                    System.out.println("THE BRICK WILL PASS");
            }

            else if (b <= x)
            {
                if (a <= y || c <= y)
                    System.out.println("THE BRICK WILL PASS");
            }

            else if (c <= x)
            {
                if (a <= y || b <= y)
                    System.out.println("THE BRICK WILL PASS");
            }

            else
            {
                System.out.println("THE BRICK WILL NOT PASS");
            }
        }
        else
            System.out.println("Please enter positive numbers only");
    }
}
