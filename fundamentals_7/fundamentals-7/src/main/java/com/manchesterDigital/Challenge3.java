package com.manchesterDigital;

public class Challenge3 {

    public static void main(String[] args) {

        int [] arr = {1,4,4,1,1,4,1};

        System.out.println(only1or4(arr));
    }

    public static Boolean only1or4(int [] arr) {

        for (int n : arr) {
            if (!(n == 1 || n == 4)) {
                return false;
            }
        }
        return true;

    }

}
