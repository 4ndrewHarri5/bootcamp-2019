package com.manchesterDigital;

public enum Countries {

    GERMANY("Germany", "de"), // can use the constructor for each element
    SPAIN("Spain", "es"),
    PORTUGAL("Portugal", "pt");
    // the elements have to be grouped


    private String name; // can also provide instance variables, so the enum has a name assosiated to it
    private String isoCode;

    Countries(String name, String isoCode) {
        this.name = name;
        this.isoCode = isoCode;
    }// can create a constructor, to initalise values within the enum when creating the enum


    //can also use getters to retrieve the values, we do not need a setter since weve used a constructor and these values should just be read only
    public String getName() {
        return name;
    }

    public String getIsoCode() {
        return isoCode;
    }
}
