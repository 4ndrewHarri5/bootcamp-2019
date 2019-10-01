package com.manchesterDigital;

public class Challenge1 {

    public static void main(String[] args) {

        int total = 0;
        for (int i = 0; i <= 500 ; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(String.format("number %d", i));
                total += i;
            }
        }
        System.out.println(String.format("total: %d", total));
    }
}
