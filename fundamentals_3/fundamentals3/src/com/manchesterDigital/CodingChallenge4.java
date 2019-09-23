package com.manchesterDigital;

/**
 *
 * Resturant Challenge
 *
 */

public class CodingChallenge4 {


    public static void main(String[] args) {

        System.out.println(allowedIn(8, 5));

    }

    public static String allowedIn(int style, double bribe) {

        return (style >= 8 && bribe >= 5) ?  "be seated" : "not allowed in";

    }

}
