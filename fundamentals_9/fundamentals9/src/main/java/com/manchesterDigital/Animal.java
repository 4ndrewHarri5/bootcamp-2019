package com.manchesterDigital;

public abstract class Animal {

    private Integer age;
    private String gender;
    private Integer weightInLbs;

    public Animal(Integer age, String gender, Integer weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
        //these are bound to the member variables || the member variables are initialised within the constructor
    }

    public void eat(){

        System.out.println("Eating");

    }


    public void sleep() {

        System.out.println("Sleeping");

    }

    public abstract void move();





}
