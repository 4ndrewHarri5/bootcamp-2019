package com.manchesterDigital;

public class Fish extends Animal {

    public Fish(Integer age, String gender, Integer weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void move() {
        swim();
    }
}
