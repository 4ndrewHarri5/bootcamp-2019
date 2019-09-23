package com.manchesterDigital;

public class Variables {

    static boolean isHungry = false;

    public static void main(String[] args) {
        greetWhenAdult(12);

        //api application protocol interface
    }

    /**
     * Greets based on age.
     *
     * @param age this is the age required
     */
    private static void greetWhenAdult(int age) {
        //to access variavles within a static class you need to make the variables static
    //scope of method, body of method
        boolean isHappy = true; //use prefix 'is' for boolean. //local because it is within the scope of that method
        // can not be seen by its parent

        if (!isHungry) {
            if (isHappy && age >= 18) { //expression statement
                System.out.println("Hello");
            }else {
                System.out.println("not old enough yet");
            }
        }

    }
}
