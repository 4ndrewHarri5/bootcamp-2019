package com.manchesterDigital;

import java.util.ArrayList;
import java.util.Collections;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacci(3));
        System.out.println(fibonacciDoWhile(3));

    }

    public static String fibonacci(int to) {

        ArrayList<Integer> allFib = new ArrayList<>();
        allFib.add(0);
        int current = 1;
        allFib.add(current);
        for (int i = 0; allFib.size() < to ; i++) {
            allFib.add(nextFibonacciNumber(allFib.get(i), current));
            current = nextFibonacciNumber(allFib.get(i), current);
        }
        return allFib.toString();
    }

    public static String fibonacciDoWhile(int to) {

        ArrayList<Integer> allFib = new ArrayList<>();
        int i = 0;
        int current = 1;
        allFib.add(0);
        allFib.add(current);

        do{
            allFib.add(nextFibonacciNumber(allFib.get(i), current));
            current = nextFibonacciNumber(allFib.get(i), current);
            i++;
        }while(allFib.size() < to);

        return allFib.toString();

    }

    public static int nextFibonacciNumber(int previous, int current) {
        return previous + current;
    }


}
