package com.manchesterDigital;

public enum DogSize {

    SMALL("meow"),
    MEDIUM("ruff"),
    LARGE("WOOF");

    private String noise;

    DogSize(String noise) {
        this.noise = noise;
    }

    public String getNoise() {
        return noise;
    }
}
