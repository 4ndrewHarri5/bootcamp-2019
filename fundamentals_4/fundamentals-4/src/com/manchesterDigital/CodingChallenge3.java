package com.manchesterDigital;

import java.util.Random;
import java.util.Scanner;

public class CodingChallenge3 {

    //rock paper scissors


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Type userChoice = Type.parseType(userInput.nextLine());

        Random random = new Random();
        double computerChoice = random.nextDouble();

        Type computerSelection = Type.Scissors;

        if (computerChoice <= 0.33) {
            computerSelection = Type.Rock;
        } else if (computerChoice <= 0.66) {
            computerSelection = Type.Scissors;
        } else {
            computerSelection = Type.Paper;
        }


        //String result = outcome(userChoice, computerSelection);

        //System.out.println(String.format("Computer choice was %s, User choice was %s ==> Result: %s",
        //computerSelection, userChoice, result));

        System.out.println(outcomeOfGame(userChoice, computerSelection));

    }

    private static String outcomeOfGame(Type userChoice, Type computerSelection) {

        if (userChoice.equals(computerSelection)) {
            return "It's a tie!";
        } else if (userChoice.beats(computerSelection)) {
            return userChoice + " beats " + computerSelection + " You win!!";
        }
        return computerSelection + " beats " + userChoice + " You lose!!";

    }

    public enum Type {

        Rock,
        Paper,
        Scissors,
        nil;

        public static Type parseType(String value) {
            if (value.equalsIgnoreCase("rock")) {
                return Rock;
            } else if (value.equalsIgnoreCase("paper")) {
                return Paper;
            } else if (value.equalsIgnoreCase("scissors")) {
                return Scissors;
            } else {
                return nil;
            }
        }

        public boolean beats(Type other) {
            switch (this) {
                case Rock:
                    return other == Scissors;
                case Scissors:
                    return other == Paper;
                case Paper:
                    return other == Rock;
                default:
                    return false;
            }
        }
    }
}




    /*private static String outcome(String userChoice, String computerSelection){



        String result = "";
        if(userChoice.equalsIgnoreCase(computerSelection)){
            result = "Draw";
        }else {

            if (userChoice == "rock" || computerSelection == "rock") {

            }

            if (userChoice.equalsIgnoreCase("paper")) {
                if (computerSelection.equalsIgnoreCase("rock")) {
                    result = "comp wins";
                } else if (computerSelection.equalsIgnoreCase("scissors")) {
                    result = "you win";
                }
            } else if (userChoice.equalsIgnoreCase("scissors")) {
                if (computerSelection.equalsIgnoreCase("rock")) {
                    result = "comp wins";
                } else if (computerSelection.equalsIgnoreCase("paper")) {
                    result = "you win";
                }
            } else {
                if (computerSelection.equalsIgnoreCase("scissors")) {
                    result = "you win";
                } else if (computerSelection.equalsIgnoreCase("paper")) {
                    result = "computer wins";
                }
            }
        }

        return result;
    }*/