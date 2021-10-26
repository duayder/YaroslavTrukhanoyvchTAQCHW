package com.yaroslav;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        chooseTask();
    }

    private static void runTaskOne() {
        Scanner sc = new Scanner(System.in);

        String string1, string2, string3;

        System.out.println("Input three numbers: ");

        float i = sc.nextFloat();
        float j = sc.nextFloat();
        float k = sc.nextFloat();

        if(-5 <= i && i <= 5)
        {
            string1 = (i + " belongs to the range");
        }

        else
        {
            string1 = (i + " doesn`t belong to the range");
        }

        if(-5 <= j && j <= 5)
        {
            string2 = (j + " belongs to the range");
        }

        else
        {
            string2 = (j + " doesn`t belong to the range");
        }

        if(-5 <= k && k <= 5)
        {
            string3 = (k + " belongs to the range");
        }

        else
        {
            string3 = (k + " doesn`t belong to the range");
        }

        System.out.println(string1 + "\n" + string2 + "\n" + string3);

        chooseTask();
    }

    private static void runTaskTwo() {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[3];

        System.out.println("Enter three numbers: ");

        for(int i = 0; i < 3; i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("The maximum value is " + arr[arr.length-1] + "\nThe minimum value is: " + arr[0]);

        chooseTask();
    }

    public enum HTTPError {
        ERROR_404_NOT_FOUND,
        ERROR_403_FORBIDDEN,
        ERROR_500_INTERNAL_SERVER,
        ERROR_503_SERVICE_UNAVAILABLE,
        ERROR_504_GATEWAY_TIMEOUT
    }

    private static void runTaskThree()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter error number (403, 404, 500, 504, 504) :");

        int number = sc.nextInt();

        switch (number)
        {
            case 403:
                System.out.println(HTTPError.ERROR_403_FORBIDDEN);
                break;
            case 404:
                System.out.println(HTTPError.ERROR_404_NOT_FOUND);
                break;
            case 500:
                System.out.println(HTTPError.ERROR_500_INTERNAL_SERVER);
                break;
            case 503:
                System.out.println(HTTPError.ERROR_503_SERVICE_UNAVAILABLE);
                break;
            case 504:
                System.out.println(HTTPError.ERROR_504_GATEWAY_TIMEOUT);
                break;
            default :
                System.out.println("Invalid input");
                break;
        }

        chooseTask();
    }

    private static void chooseTask()
    {
        Scanner sc = new Scanner(System.in);

        int taskNumber;

        System.out.println("///////////////////////");
        System.out.println("Enter 1 to run task one");
        System.out.println("Enter 2 to run task one");
        System.out.println("Enter 3 to run task one");

        taskNumber = sc.nextInt();

        if(taskNumber == 1)
        {
            runTaskOne();
        }

        else if(taskNumber == 2)
        {
            runTaskTwo();
        }

        else if(taskNumber == 3)
        {
            runTaskThree();
        }

        else
        {
            System.out.println("Enter a valid number");
        }
    }

}
