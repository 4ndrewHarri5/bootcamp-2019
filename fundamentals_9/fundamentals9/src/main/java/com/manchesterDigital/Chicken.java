package com.manchesterDigital;

public class Chicken extends Bird {
    public Chicken(Integer age, String gender, Integer weightInLbs, Integer wingspan) {
        super(age, gender, weightInLbs, wingspan);
    }

    public void move() {
        System.out.println("Im moving a chicken");
    }
}
