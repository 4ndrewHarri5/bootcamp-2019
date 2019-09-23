package com.manchesterDigital;

public class CodingChallenge2 {

    public static void main(String[] args) {

        System.out.println(lastDigit(16, 23984796));

    }

    public static boolean lastDigit(int first, int last) {

        return (first % 10) == (last % 10);

    }

}
