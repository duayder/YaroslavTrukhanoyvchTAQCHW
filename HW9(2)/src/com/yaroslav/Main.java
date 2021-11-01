package com.yaroslav;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws OutOfRangeException {
        int savedInt = 1;
        for(int i = 0; i < 10; i++){
            try {
                savedInt = readNumber(savedInt, 100);
            } catch (OutOfRangeException e){
                System.out.println("Out of range");
            } catch (InputMismatchException e){
                System.out.println("Not an integer");
            }
        }
    }

    public static int readNumber(int start, int end) throws OutOfRangeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reading number from " + start + " to " + end);
        int myint = sc.nextInt();
        if (myint <= start || myint >= end) {
            throw new OutOfRangeException("Not in range");
        }
        return myint;
    }
}
