package com.manchesterDigital;


import java.util.List;
import java.util.stream.Collectors;

public class Challenge1 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3);

        List<Integer> numbersSquared = squareNumbers(numbers);

        System.out.println("numbersSquared = " + numbersSquared);

        List<Integer> rightMostDigitOfNumbers = rightDigit(numbers);

        System.out.println("rightMostDigitOfNumbers = " + rightMostDigitOfNumbers);


    }

    /**
     * Given a list of integer, return a list where each integer is multiplied by itself
     *
     * square([1, 2, 3]) -> [1, 4, 9]
     * square([6, 8, -8]) -> [36, 64,64]
     * square([ ]) -> [ ]
     *
     */

    private static List<Integer> squareNumbers(List<Integer> numbers) {

        return numbers.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());

    }

    /**
     * Given a list of non-negative integers, return an integer list of the rightmost digits.
     *
     * tip: % is your friend.
     *
     * rightDigit([1, 22, 93]) -> [1, 2, 3]
     * rightDigit([16, 8, 886]) -> [6, 8, 6]
     *
     * private static List<Integer> rightDigit(List<Integer> nums) {
     *     // ….
     * }
     */

    private static List<Integer> rightDigit(List<Integer> numbers) {

        return numbers.stream()
                .map(i -> i % 10)
                .collect(Collectors.toList());
    }

}
