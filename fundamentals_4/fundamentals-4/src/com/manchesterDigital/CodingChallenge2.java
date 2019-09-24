package com.manchesterDigital;

import sun.misc.IOUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodingChallenge2 {

    public static void main(String[] args) {
        System.out.println(registrationGenerator("SAIBG"));
    }

    private static String registrationGenerator(String input) {

        String [] inputAsArr = input.split("");

        List<String> inputArray = Arrays.asList(inputAsArr);
        String inputChanged = inputArray.stream().map(s -> convert(s)).collect(Collectors.joining());
        return inputChanged;

    }

    public static String convert(String c) {
        switch(c) {
            case "S":
                return Reg.S.toIntAsString();
            case "A":
                return Reg.A.toIntAsString();
            case "I":
                return Reg.I.toIntAsString();
            case "B":
                return Reg.B.toIntAsString();
            case "G":
                return Reg.G.toIntAsString();
            default:
                return c;
        }
    }





}

enum Reg {

    S,
    A,
    I,
    B,
    G;

    public String toIntAsString(){
        switch(this) {
            case S:
                return "5";
            case A:
                return "4";
            case I:
                return "1";
            case B:
                return "8";
            case G:
                return "9";
            default:
                return "";
        }
    }

}
