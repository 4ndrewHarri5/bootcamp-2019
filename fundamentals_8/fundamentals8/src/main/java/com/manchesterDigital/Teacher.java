package com.manchesterDigital;

public class Teacher extends Person {

    public Teacher(String firstName, String lastName, Integer age, Address address) {
        super(firstName, lastName, age, address);
    }

    //@Override // good to have even if you dont need it
    public void haveLunch() {
        System.out.println("Having lunch at 13.00");
    }
}
