package com.manchesterDigital;

public class Utility {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isNamesMatch(String firstName, String lastName){
        return firstName.equalsIgnoreCase(lastName);
    }

    /**
     *
     * @param input
     * @return
     * @throws NumberFormatException because the string may not contain a number, or may be outside the boundaries of Long
     */
    public static Long convertStringToLong(String input) throws NumberFormatException {
        return new Long(input);
    }

}
