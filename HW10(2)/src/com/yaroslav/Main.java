package com.yaroslav;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<String, String> studentsList = new HashMap<>(){
            {
                put("Vizapyakop", "Dmytro");
                put("Volovylchenko", "Orest");
                put("Danylvik", "Orest");
                put("Olenko", "Oksana");
                put("Golovach", "Lena");
                put("Petrov", "Andriy");
                put("Andriiv", "Petro");
                put("Tarasiv", "Taras");
                put("Sobaka", "Pirat");
                put("Familiya", "Imya");
            }
        };

        Set<String> names = new HashSet<String>();
        for(String name: studentsList.values())
        {
            if(names.contains(name)){
                System.out.println("There are two matching names");
            } else{
                names.add(name);
            }
        }
        for (var entry:studentsList.entrySet().stream().collect(Collectors.toList()))
        {
            if(entry.getValue() == "Orest"){
                studentsList.remove(entry.getKey());
            }
        }
        System.out.println(studentsList);
    }
}
