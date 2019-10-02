package com.manchesterDigital;

public class Caller {

    private String number;
    private final String areaCode;

    public Caller(String number) {
        this.number = number;
        areaCode = "+44";

    }

    public String getNumber() {
        return number;
    }

    public String getAreaCode() {
        return areaCode;
    }
}
