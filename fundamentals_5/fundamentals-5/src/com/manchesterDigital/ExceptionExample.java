package com.manchesterDigital;

public class ExceptionExample {

    public static void main(String[] args) {
        int[] intArray = {2,3,4};

        printArray(0, intArray);
        printArray(1, intArray);
        printArray(2, intArray);

        //will throw exception

        try {
            printArray(3, intArray); // -> will try to access index 3 in an array that only has index 2: java.lang.ArrayIndexOutOfBoundsException: 3
        }catch(ArrayIndexOutOfBoundsException e) {

            System.err.println("element does not exist: you used " + e.getLocalizedMessage() + " but there are only " + (intArray.length-1) + " indexs");
        }

    }

    private static void printArray(int index, int[] arr) {
        System.out.println("Element" + index + " is " + arr[index]);
    }

}
