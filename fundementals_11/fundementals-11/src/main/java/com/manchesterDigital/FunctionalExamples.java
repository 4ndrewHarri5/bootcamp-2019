package com.manchesterDigital;

import java.util.List;
import java.util.function.Function;

public class FunctionalExamples {

    public static void main(String[] args) {

        //1st calculate total price of all
        //2nd multiply sales by tax
        //3rd add sales to total
        //4th return total

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);


        //old way. had to tell the compiler many things, e.g. size, loop etc

        for (int i = 0; i < numbers.size(); i++) {

            System.out.println("i = " + i);

        }

        // moved on 2000s

        for (Integer i : numbers) {
            System.out.println("i = " + i);
        }
        //removes i, less steps to do

        //functional programming came in around version 8
        //in functional programming, values are immutable. it comes doen to a lot of methmatical operations
        // a form of deceptive programming. telling it what to do, not how

        /*
        //1. pure functions
        returns the output of some input, that's it. e.g. a+b would return c
        no side effects, since not changing anything or doing anything inside it

        2. function can be created as a variable. (can assign a function to a variable) and be reused by the
        variable name

        3. high order functions
        can also receive functions from another function. A function can be provided to a method

        */

        //Lamda Expression

        //is nothing more than anonymous functions, it is just a short snappy way of writing code. a lambda
        // expression is then assigned to a function
        //

        /** structure
         *
         * (A list of parameters separated by commas) -> { expression body which contains one or more statements }
         *
         */

        NumericTest isEven = n -> n % 2 == 0;
        // a lamda expression

        // given a number, work out if it is even

        System.out.println(
                "is 4 an even number? " + isEven.computeTest(4)
        );

        System.out.println(
                "is 5 an even number? " + isEven.computeTest(5)
        );

        NumericTest isNegative = n -> (n < 0);

        System.out.println(
                "-1 is negative " + isNegative.computeTest(-1)
        );


        // we have them because they are very simple to use

        //anonymous class
        NumericTest isOdd = new NumericTest() {
            @Override
            public boolean computeTest(int n) {
                return n % 2 != 0;
            }
        };

        System.out.println(isOdd.computeTest(5));

        // can write is as:
        // since everything is inferred

        NumericTest isOdd2 = (n) -> n % 2 != 0;
        isOdd2.computeTest(2);

        // lamda expression has to come from an interface with just one method


        //How you dont do it
        Function<String, Integer> getWordLength = new Function<String, Integer>(){
            @Override
            public Integer apply(String word) {
                return word.length();
            }
        };

        System.out.println(getWordLength.apply("hey"));


        //Modern version

        Function<String, Integer> getWordLengthModernised = String::length;
        //method reference, you are referencing something called length from a class called string. basically saying, find me this method in that class

        Integer len = getWordLengthModernised.apply("Amy");
        System.out.println("len = " + len);


        Function<Artist, String> extractArtistName = Artist::getName;
        Function<String, String> convertToUppercase = String::toUpperCase;

        Artist skepta = new Artist("Skepta", 2_000_000L);
        String artistName = extractArtistName.apply(skepta);
        String uppercaseName = convertToUppercase.apply(artistName);


        convertToUppercase.apply(extractArtistName.apply(skepta));

        extractArtistName.andThen(convertToUppercase).apply(skepta);
        
        
        Function<Integer, Double> half = a -> a / 2.0d;

        half = half.compose(a -> a * 3);

        //run the right side, and then run the halfing of it afterwards

        System.out.println("half.apply(5) = " + half.apply(5));

        half = half.andThen(a -> a * 3);
        System.out.println(half.apply(5));

        NumberCalculator multiplyBy2 = (a,b) -> a * b;
        System.out.println(multiplyBy2.calculate(5, 2));

        //coding standards, dont need prethesise if only passing in one variable


        Function<Integer, Integer> multiplyBy02 = a -> a * 2;
        System.out.println(multiplyBy02.apply(3));


        NumberCalculator multiply = (a,b) -> a * b;
        System.out.println(multiply.calculate(5, 5));

        Function<Numbers, Integer>  multiply2 = (a) -> a.getA() * a.getB();
        multiply2.apply(new Numbers(5,5));

        //function only takes one thing, and returns one thing, therefore you make a class to hold those two values


        Divider divider = (a,b) -> a / b;
        Double doubleResult = divider.divideIt(6d, 3d);
        System.out.println("doubleResult = " + doubleResult);

        //this will fail
        Double doubleResult2 = divider.divideIt(6d, 0d);
        System.out.println("doubleResult2 = " + doubleResult2);

        /*Divider safeDivider = (a,b) -> {
            if (b == 0) {
                return 0d;
            }
            return a / b;
        };*/

        Divider safeDivider = (a,b) -> (b == 0) ? b : a /b;

        Double aDouble = safeDivider.divideIt(6d, 0d);
        System.out.println("aDouble = " + aDouble);

        Function<DivideNumbers, Double> dividerFunc = a -> (a.getB() == 0) ? a.getB() : a.getA() / a.getB();
        Double apply = dividerFunc.apply(new DivideNumbers(3d, 2d));
        System.out.println("apply = " + apply);






    }
}
