package com.manchesterDigital;

public class SwitchStatements {

    public static void main(String[] args) {

        int coinInserted = 50;

        switch (coinInserted) {
            case 10:
                System.out.println("Inserted 10p");
                break; // do not go any further than that line, come out of that switch statement
            case 20:
                System.out.println("Inserted 20p");
                break;
            case 50:
                System.out.println("Inserted 50p");
                break;
            case 100:
                System.out.println("Inserted £1");
                break;
            default: // best practice to put a default in
                System.out.println("Inserted an invalid coin");
                // dont need break for default

        }
        switch (coinInserted) {
            case 10:
            case 20:
                warningMessage(coinInserted);
                break;
            case 50:
                System.out.println("Inserted 50p");
                break;
            default:
                System.out.println("Inserted an invalid coin");
                // can do this if they have the same outcome

        }

    }

    public static void warningMessage(int input) {
        System.out.println("You inputted" + input + " Not enough dollars!!!!");
    }

}
