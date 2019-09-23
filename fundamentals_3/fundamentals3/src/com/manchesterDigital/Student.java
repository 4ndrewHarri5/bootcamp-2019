package com.manchesterDigital;

public class Student {
    /// this is an example of an instance variable: belongs to the instance its self
    public static final String CLASS_NAME = "Bootcamp"; //constant, use underscore to separate words in constant and capatalise

    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public static void main(String[] args) {
        Student student = new Student("Andrew");
        student.printDetails();
    }

    public void printDetails() {

        System.out.println("Student's name is " + studentName);

    }
}