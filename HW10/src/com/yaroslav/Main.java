package com.yaroslav;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5));
        Set<Integer> unionSet = union(set1,set2);
        Set<Integer> intersectSet = intersect(set1,set2);
        System.out.println("Intersection is " + intersectSet);
        System.out.println("Union is " + unionSet);
    }

    public static <E> Set<E> union(Set<E> set1, Set<E> set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static  <E> Set<E> intersect(Set<E> set1, Set<E> set2){
        Set<E> result = new HashSet<>();
        Set<E> union = union(set1, set2);
        for(E element: union){
            if(set1.contains(element) && set2.contains(element)){
                result.add(element);
            }
        }
        return result;
    }
}
