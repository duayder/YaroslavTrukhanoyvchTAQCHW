package com.yaroslav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Dog firstDog = new Dog("Bobik", Dog.Breed.Beagle, 3);
        Dog secondDog = new Dog("Sharik", Dog.Breed.Akita, 5);
        Dog thirdDog = new Dog("Tuzik", Dog.Breed.Hound, 7);

        if(firstDog.getName().equals(secondDog.getName()))
        {
            System.out.println("The names of first and second dogs match");
        }

        else if(firstDog.getName().equals(thirdDog.getName()))
        {
            System.out.println("The names of first and third dogs match");
        }

        else if(secondDog.getName().equals(thirdDog.getName()))
        {
            System.out.println("The names of second and third dogs match");
        }

        else
        {
            System.out.println("There are no dogs with matching names");
        }

        int [] arr = new int[3];
        arr[0] = firstDog.getAge();
        arr[1] = secondDog.getAge();
        arr[2] = thirdDog.getAge();

        Arrays.sort(arr);

        if(firstDog.getAge() == arr[arr.length-1])
        {
            System.out.println(firstDog.getName() + " is the oldest dog. The dogs`s age is " + firstDog.getAge() + " ,the dog`s kind is " + firstDog.getDogBreed());
        }

        else if(secondDog.getAge() == arr[arr.length-1])
        {
            System.out.println(firstDog.getName() + " is the oldest dog. The dogs`s age is " + secondDog.getAge() + " ,the dog`s kind is " + secondDog.getDogBreed());
        }

        else if(thirdDog.getAge() == arr[arr.length-1])
        {
            System.out.println(thirdDog.getName() + " is the oldest dog. The dogs`s age is " + thirdDog.getAge() + " ,the dog`s kind is " + thirdDog.getDogBreed());
        }
    }
}
