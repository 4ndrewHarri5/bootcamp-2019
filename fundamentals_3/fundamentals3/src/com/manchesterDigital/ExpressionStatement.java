package com.manchesterDigital;

public class ExpressionStatement {

    //expression can be made up of variables, methods. calling multiple things together

    public static void main(String[] args) {

        int years = 5;
        double interestRate = 0.4d; //'d' explicitly tells compiler we are using doubles

        double amountOfInterest = interestRate * years; //expression statement
        System.out.println("Interest is " + amountOfInterest);
        
        //topic we haven't covered
        //
        
        double radius = 12.0d;
        double outcome = Math.PI * radius * radius;

        int score = 2000;

        if (score > 1000) {
            System.out.println("Scrore is greater than 1000!");
        }


    }

}
