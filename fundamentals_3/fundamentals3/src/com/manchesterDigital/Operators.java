package com.manchesterDigital;

public class Operators {

    public static void main(String[] args) {

        //Example of addition operator:
        int result = 1 + 2; //addition
        System.out.println("Result is " + result); // concatenation

        //Subtraction
        result =  3-1;
        System.out.println("Result is " + result);

        //multiplication
        result =  3*1;

        //division
        result = 6/2;

        //modulus
        result = 20 % 10;

        //increment
        result = result + 1;
        result += 1;
        result++; // Post-increment, because '+' symbol is after the variable
        ++result; //Pre-increment

        //decrement
        result = result - 1;
        result -= 1;
        result--; //post-decrement
        --result; //pre-decrement

        result = result + 3;
        // addition operator in an abbreviated way:
        result += 3;

        result = result - 10;
        // subtraction operator in an abbreviated way:
        result -= 10;

        result *= 20;

        result /= 20;


        boolean isRainingToday = false;
        if (!isRainingToday) {
            System.out.println("you won't need a jacket");
        }

        int number1 = 100;
        int number2 = 200;

        if (number1 == number2) {

        }

        if (number1 != number2) {

        }

        if (number1 < number2) {

        }

        if (number1 > number2) {

        }

        int degreeScore = 60;
        int overallScore = 100;

        if (degreeScore >= 60 && overallScore >= 100) {

        }

        if (degreeScore >= 60 || overallScore >= 100) {

        }

        int someValue = 1;

        if (someValue == 1) {

        }

        boolean isAnimal = false;

        if(isAnimal = true) {
            System.out.println("I am an animal");
        }

        String lastName = "Sousa";

        if(lastName.equals("")){

        }


        int numberOfMealsToday = 1;

        //example of a ternary operator
        boolean isHungry = numberOfMealsToday == 1 ? true : false;

    }

}


