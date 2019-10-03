package com.manchesterDigital;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        /*Animal animal = new Animal(5,"Male",32);
        animal.eat();
        animal.sleep();*/

        /*Bird bird = new Bird(12, "Female", 12, 78);
        bird.eat();
        bird.move();
        bird.move();*/

        Chicken chicken = new Chicken(12, "Female", 5, 20);
        chicken.sleep();
        chicken.move();

        Magpie maggie = new Magpie(14,"Male", 9, 78);
        maggie.fly();
        maggie.move();

        Magpie magpie = new Magpie(34, "Undefined", 50, 80);

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(maggie);
        animals.add(chicken);

        for (Animal animal : animals) {

            animal.move();

        }

        Flyable someAnimalThatFlies = new Magpie(34, "Undefined", 50, 80);
        someAnimalThatFlies.fly();

        List<Flyable> flyables = new ArrayList<Flyable>();
        flyables.add(someAnimalThatFlies);
        flyables.add(maggie);
        //flyables.add(chicken); // not an implementer of flyable

    }

}
