package com.manchesterDigital;

import jdk.internal.instrumentation.TypeMapping;

import java.util.Arrays;
import java.util.Currency;
import java.util.Date;

/**
 * Playing around with data types and variables
 * Describes usage of variables and data types
 * @author Andrew Harris
 */

public class Variables {

    public static void main(String[] args) {

        int numberOfAnimals; //initalise

        numberOfAnimals = 10; //declare

        System.out.println("number of animals = " + numberOfAnimals);

        String i1 = null;

        System.out.println(i1);

        String hey = "woha";

        long diameterOfSunInMiles = 12L;

        short feetSize = 9;

        boolean itsRaining = false;

        System.out.println(itsRaining);

        float pi = 3.14f;

        double piDouble = 3.14; // or 3.14d

        char inital = 'A';

        String firstname = "John";
        String lastname = "Doe";

        String together = firstname + " " + lastname;

        System.out.println(together);

        System.out.printf("Name: %s %s", firstname, lastname);

        System.out.println(String.format("Name: %s %s", firstname, lastname));

        StringBuilder output = new StringBuilder();

        output.append(firstname)
                .append(" ")
                .append(lastname);

        System.out.println(output.toString());


        int[] numbers = new int[10];

        numbers[0] = 99;

        System.out.println(numbers[0]); //will print 99

        System.out.println(Arrays.toString(numbers));

        int[] lotteryNumbers = {23, 16, 60};

        System.out.println(lotteryNumbers[2]);

        String [] names = { "john", "doe", "mike"};

        Date today = new Date();
        System.out.println(today.getTime()); //Not safe to use


        Integer num = 10;

        System.out.println(num.byteValue());


        Boolean myBool = Boolean.FALSE;
        myBool = true;

        Short myShort = Short.BYTES;

        Currency myCurrency = new Currency();

        final int myInt = 9;

    }

    /**
     *
     * This is a hello method
     *
     * @deprecated because it is rubbish. Use {@link CodingStandard}
     */
    @Deprecated
    private static void hello () {
        System.out.println("hello");
    }

}
