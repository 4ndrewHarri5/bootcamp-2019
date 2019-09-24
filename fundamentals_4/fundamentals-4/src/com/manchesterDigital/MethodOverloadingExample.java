package com.manchesterDigital;

public class MethodOverloadingExample {

    //member method since it is a member to the class
    public int multiply(int a, int b){

        return a * b;
    }

    public int multiply(int first, int second, int third) {

        return first * second * third;

    }

    public int multiply(int... args) {

        return args[0];

    }

    public static void main(String[] args) {

        //
        MethodOverloadingExample me = new MethodOverloadingExample(); //creating a new instance of a class

        int result = me.multiply(3, 3);
        System.out.println("Result: " + result);

        System.out.println(me.multiply(3,3,3));

    }


}
