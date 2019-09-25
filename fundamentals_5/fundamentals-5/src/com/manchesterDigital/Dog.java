package com.manchesterDigital;

public class Dog {

    public static final int NUMBER_OF_TEETH = 1;
    private int sizeOfDog; // member/instance variable since it is a member of the dog class

    public Dog(int sizeOfDog) {
        this.sizeOfDog = sizeOfDog;
    }

    public String bark() { // behaviours that the class can do, this is a member method

        if (sizeOfDog > 60) {
            return "WOOF!!!!!";
        }else if (sizeOfDog > 15) {
            return "WOOF";
        }
        return "woof";

    }


    public static void relieve(){
        System.out.println("Gone for a dump ....");
    }

}
