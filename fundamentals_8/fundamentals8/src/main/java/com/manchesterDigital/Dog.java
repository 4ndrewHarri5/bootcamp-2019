package com.manchesterDigital;

public class Dog {

    private String bread;
    private Colour colour;
    private Colour eyeColour;
    private Size size;
    private DogSize dogSize;
    private String name;
    private Integer age;
    private Integer aggressionLevel;
    private Integer hungerLevel;

    public Dog(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    public void bark() {

        System.out.println(dogSize.getNoise());

    }


    public void hungry() {

        if (hungerLevel > 10) {
            for (int i = 0; i < 10; i++) {
               bark();
            }
            System.out.println("Gimme food!!! " + dogSize.getNoise());
        }else{
            System.out.println("Im stuffed!!");
        }

    }

    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setEyeColour(Colour eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setDogSize(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAggressionLevel(Integer aggressionLevel) {
        this.aggressionLevel = aggressionLevel;
    }
}
