package com.manchesterDigital;

import javax.rmi.CORBA.Util;

public class Runner {

    public static void main(String[] args) {

        boolean even = Utility.isEven(5); //finds utility because we have the package,
        // so it traverses the package to find it
        System.out.println(String.format("Result: %b", even));

        boolean namesMatch = Utility.isNamesMatch("andrew", "harris");
        System.out.println(String.format("is the firstname the same as the last? %b", namesMatch));

        Dog poodle = new Dog(20);
        System.out.println(poodle.bark());

        Dog rottweiler = new Dog(100);
        System.out.println(rottweiler.bark());

        Dog.relieve();

        System.out.println(Dog.NUMBER_OF_TEETH);

        Long id;

        try {
            id = Utility.convertStringToLong("92233720368547758079");
            System.out.println(id);
        }catch (NumberFormatException e) {
            System.err.println("Input provided was not a valid number " + e);
            id = Long.MAX_VALUE;
        }

        System.out.println("My id is = " + id);
    }




}
