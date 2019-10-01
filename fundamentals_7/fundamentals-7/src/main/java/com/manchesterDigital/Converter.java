package com.manchesterDigital;

public class Converter {

    public static String convert(Bytes to, int value){

        StringBuilder result = new StringBuilder();

        result.append(value*1024).append(to.toName());

        return result.toString();

    }
}

enum Bytes {
    KB,
    MB;

    public String toName() {
        switch (this) {
            case MB:
                return "MB";
            case KB:
                return "KB";
            default:
                return "";
        }
    }
}