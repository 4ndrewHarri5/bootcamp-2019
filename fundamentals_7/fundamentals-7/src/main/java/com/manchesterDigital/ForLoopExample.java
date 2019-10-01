package com.manchesterDigital;

public class ForLoopExample {

    public static void main(String[] args) {

        /**
         * for (initialisation; boolean expression; update statement) {
         *
         * }
         */

        for (int i = 0; i <= 100; i++) {

            System.out.println("i = " + i);

        }

        int x = 0;
        for (x = 0; x <= 100; x++) {

            System.out.println("x = " + x);

        }

        String [] names = {"1", "b"};
        for (String name : names) {

        }

        //what does this do?
        /*for(;;) {
            System.out.println("Wohooooo");
        }*/



    }




}
