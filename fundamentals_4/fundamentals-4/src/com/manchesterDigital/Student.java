package com.manchesterDigital;

import java.util.Objects;

public class Student {

    private String name; //member variable, belongs to the class
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override //use this instead of the standard method. you are overriding the standard one.
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public static void main(String[] args) {
        Student andrew = new Student("Andrew");
        Student andy = new Student("Andy", 19);


    }

}
