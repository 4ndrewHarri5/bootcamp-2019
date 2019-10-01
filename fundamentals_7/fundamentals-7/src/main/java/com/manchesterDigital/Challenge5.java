package com.manchesterDigital;

public class Challenge5 {

    public static void main(String[] args) {

        tenGreenBottles();

    }

    public static void tenGreenBottles() {
        for (int i = 10; i > 0 ; i--) {

            System.out.println(String.format("%s green bottles sitting on the wall,\n" +
                    "%s green bottles sitting on the wall,\n" +
                    "And if one green bottle should accidentally fall,\n" +
                    "There’ll be %s green bottles sitting on the wall.\n", numberToString(i), numberToString(i), numberToString(i-1)));

        }
    }

    public static String numberToString(int number) {
        switch (number){
            case 10: return "Ten";
            case 9: return "Nine";
            case 8: return "Eight";
            case 7: return "Seven";
            case 6: return "Six";
            case 5: return "Five";
            case 4: return "Four";
            case 3: return "Three";
            case 2: return "Two";
            case 1: return "One";
            case 0: return "Zero";
            default: return "";

        }
    }
}


