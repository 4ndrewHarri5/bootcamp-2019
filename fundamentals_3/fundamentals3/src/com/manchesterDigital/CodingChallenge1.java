package com.manchesterDigital;

public class CodingChallenge1 {

    public static void main(String[] args) {

        double numberOfChickens = 20d;
        double numberOfCows = 80d;

        double allAnimals = (numberOfChickens + numberOfCows)*25;

        double remainder = allAnimals % 40;

        System.out.println("the remainder = " + remainder);

        if (remainder <= 20) {
            System.out.println("Total was over the limit");
        }else {
            System.out.println("Total is not over the limit");
        }

    }

}
