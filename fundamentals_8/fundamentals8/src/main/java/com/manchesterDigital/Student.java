package com.manchesterDigital;

public class Student extends Person {

    private String universityName;

    public Student(String firstName, String lastName, Integer age, Address address) {
        super(firstName, lastName, age, address);
    }

    public void haveLunch() {

        System.out.println("Has lunch at 12");

    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {

        StringBuilder output = new StringBuilder();

        output.append("University Name: ");
        output.append(universityName);
        output.append("\n");
        output.append("Person: ");
        output.append(getFirstName());

        return output.toString();

    }

}
