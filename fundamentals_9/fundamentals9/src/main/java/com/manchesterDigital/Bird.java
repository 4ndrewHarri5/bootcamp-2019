package com.manchesterDigital;

public abstract class Bird extends Animal{

    private Integer wingspan;

    public Bird(Integer age, String gender, Integer weightInLbs, Integer wingspan) {
        super(age, gender, weightInLbs);
        this.wingspan = wingspan;
    }

}
