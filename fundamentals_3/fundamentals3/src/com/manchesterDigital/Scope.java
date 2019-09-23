package com.manchesterDigital;

import java.util.Date;

public class Scope {

    public static void main(String[] args) {
        int age = 20;
        boolean hasDrivingLicence = true;

        if (age >= 20) {
            int height = 10;

            if(hasDrivingLicence) {

                height = 20;

                Date expiryDate = new Date();

            }

            height = 20;

        }


    }

}
