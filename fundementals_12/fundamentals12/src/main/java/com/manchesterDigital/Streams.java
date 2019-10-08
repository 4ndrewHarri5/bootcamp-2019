package com.manchesterDigital;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int result = 0;
        for (Integer i : numbers) {
            result += i * 2;
        }

        System.out.println("result = " + result);


        Integer reduce = numbers.stream()
                .map(i -> i * 2)
                .reduce(0, (x,y) -> x+y);

        Integer reduceWithMethodReference = numbers.stream()
                .map(i -> i * 2)
                .reduce(0, Integer::sum);

        int sum = IntStream.range(0, 10).sum();

        int anotherSum = IntStream.rangeClosed(1, 10).sum();

        System.out.println("anotherSum = " + anotherSum);

        // reduce will go through each item and use the current and all to compute something


        List<String> names = List.of("John", "Amy", "Jack");

        for(String name : names) {
            String uCase = name.toUpperCase();
            System.out.println("uCase = " + uCase);
        }

        List<String> uppercaseNames = names.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        List<String> uppercaseUsingMethodRef = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());


        List<List<String>> richPeople = List.of(
                List.of("Jeff Bezos"),
                List.of("Bill Gates"),
                List.of("Deborah Meadon"),
                List.of("Mark Zurckerberg")
        );

        List<String> flattenedRichPeople = richPeople.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());


        System.out.println("flattenedRichPeople = " + flattenedRichPeople);




    }

}
