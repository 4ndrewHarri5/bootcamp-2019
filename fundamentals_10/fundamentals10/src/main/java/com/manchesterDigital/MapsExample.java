package com.manchesterDigital;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {


    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();

        //names.put(1, "John");
        names.put(2, "Jill");
        names.put(3, "Susan");
        names.put(4, "Andrew");
        names.put(1, "John");

        for(Map.Entry<Integer, String> entry : names.entrySet()){
            System.out.println("entry.getValue() = " + entry.getValue());
            System.out.println("entry.getKey() = " + entry.getKey());
        }

        Map<Integer, String> countries = new TreeMap<>();
        countries.put(1, "England");
        countries.put(2, "Spain");
        countries.put(99, "France");
        countries.put(77, "Germany");

        for(Map.Entry<Integer, String> entry : countries.entrySet()){
            System.out.println("entry.getValue() = " + entry.getValue());
            System.out.println("entry.getKey() = " + entry.getKey());
        }

    }

}

