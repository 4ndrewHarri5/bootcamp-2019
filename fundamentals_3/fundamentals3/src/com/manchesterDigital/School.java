package com.manchesterDigital;

import static com.manchesterDigital.Student.CLASS_NAME; //static import, therefore we dont need to reference the class name

public class School {

    public static void main(String[] args) {
        Student april = new Student("April");
        april.printDetails();

        System.out.println(CLASS_NAME);

    }

}
