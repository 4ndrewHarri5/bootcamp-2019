package com.manchesterDigital;

import java.util.ArrayList;

public class Challenge4 {

    public static void main(String[] args) {


        int sum = 0;
        int allNums = 0;

        for (int i = 0; i <= 100 ; i++) {
            sum+=i;
            allNums++;
        }

        System.out.println(String.format("The sum of all the numbers up to 100 is: %d, with an average of %d.", sum, sum/allNums));

    }

}
