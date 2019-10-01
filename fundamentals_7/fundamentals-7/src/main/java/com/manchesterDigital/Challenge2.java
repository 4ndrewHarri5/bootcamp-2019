package com.manchesterDigital;

public class Challenge2 {

    public static void main(String[] args) {

        System.out.println(stringTimes("HI", 2));


    }

    public static String stringTimes(String str, int n){

        StringBuilder result = new StringBuilder();
        result.append(str);
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();

    }

}
