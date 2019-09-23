package com.manchesterDigital;

public class Challenge5 {

    public static void main(String[] args) {

        System.out.println(luckySum(1,2,3));
        System.out.println(luckySum(1,2,13));
        System.out.println(luckySum(1,13,3));
    }


    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        int [] allNumbers = {a, b, c};

        for( int i = 0; i < allNumbers.length; i++){
            if (allNumbers[i] == 13) {
                break;
            }else{
                sum += allNumbers[i];
            }
        }
        return sum;
    }

}
