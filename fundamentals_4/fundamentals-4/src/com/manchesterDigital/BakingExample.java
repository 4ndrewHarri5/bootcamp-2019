package com.manchesterDigital;

public class BakingExample {

    public static void main(String[] args) {

        System.out.println(switchOvenOn(1));

    }

    public void decorate() {

        System.out.println("Decorating cake ...");

    }

    protected static int switchOvenOn(int setting){

        System.out.println("switching oven on to setting level " + setting);

        int minutesToCook = 0;

        switch (setting){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Set to level " + setting);
                minutesToCook += ((setting+1)*10);
                break;
            default:
                System.out.println("Oven is off");
        }

        return minutesToCook;

    }

    private static void produceMixture() {

        System.out.println("Mixing ....");

    }


}
