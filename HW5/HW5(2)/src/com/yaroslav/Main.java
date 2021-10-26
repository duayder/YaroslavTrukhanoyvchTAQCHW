package com.yaroslav;

import java.util.Arrays;
import java.util.function.DoubleFunction;

public class Main {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Bobik", Dog.Breed.Beagle, 3);
        dogs[1] = new Dog("Sharik", Dog.Breed.Akita, 5);
        dogs[2] = new Dog("Tuzik", Dog.Breed.Hound, 7);

        int maximum = dogs[0].getAge();
        int oldestDogIndex = 0;

        for(int i = 0; i < dogs.length; i++)
        {
            if(dogs[i].getAge() > maximum)
            {
                maximum = dogs[i].getAge();
                oldestDogIndex++;
            }
        }

        int j;
        for(int i = 0; i < dogs.length; i++)
        {
            for(j = i + 1; j < dogs.length; j++)
            {
                if(dogs[i].getName()!=dogs[j].getName())
                {
                    System.out.println(dogs[i].getName() + " doesn`t match " + dogs[j].getName());
                }
                else
                {
                    System.out.println(dogs[i].getName() + " matches " + dogs[j].getName());
                }
            }
        }

        System.out.println("The oldest dog is " + maximum + " years old. The dog`s name is " + dogs[oldestDogIndex].getName() + ". The dog`s breed is " + dogs[oldestDogIndex].getDogBreed());
    }
}
