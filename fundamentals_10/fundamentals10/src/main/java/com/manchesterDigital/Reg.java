package com.manchesterDigital;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Reg {
    public static String ConvertReg (String reg){
        String regex = "^[A-Z0-9_]{5,7}$";
        if(!reg.matches(regex)){
            throw new RegInvalidException("Please check the length is between 5 and 7 and that you haven't used any invalid characters");
        } else {
            String[] arr = reg.split("");
            List<String> regArr = Arrays.asList(arr);
            Stream<String> finalReg = regArr.stream().map(s -> converter(s));
            return finalReg.collect(Collectors.joining());
        }
    }
    public static String converter(String s) {
        if (s.equals("S")) {
            return "5";
        } else if (s.equals("A")) {
            return "4";
        } else if (s.equals("G")) {
            return "9";
        } else if (s.equals("B")) {
            return "8";
        } else if (s.equals("I")) {
            return "1";
        } else {
            return s;
        }
    }
}
