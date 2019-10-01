package com.manchesterDigital;

public class WhileExample {

    public static void main(String[] args) {

        double growthRate = 0.04d; // 4%
        int population = 800; //initial population
        int year = 0; //ie present time

        /*while (population <= 1200) {
            Double tempPopulation = new Double(population * (1+growthRate));
            population = tempPopulation.intValue();
            year++;
        }

        System.out.println("year = " + year);
        System.out.println("population = " + population);
        */

        do{
            Double tempPopulation = new Double(population * (1+growthRate));
            population = tempPopulation.intValue();
            year++;
        }while(population <= 1200);

        System.out.println("year = " + year);
        System.out.println("population = " + population);

    }

}
