package com.manchesterDigital;

public class Magpie extends Bird implements Flyable {

    public Magpie(Integer age, String gender, Integer weightInLbs, Integer wingspan) {
        super(age, gender, weightInLbs, wingspan);
    }

    public void fly() {
        System.out.println("Magpie Flying");
    }

    public void move() {
        System.out.println("im flapping my wings!!!!");
    }
}
