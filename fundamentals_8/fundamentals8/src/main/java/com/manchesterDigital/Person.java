package com.manchesterDigital;

public class Person {

    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Address address;

    public Person(String firstName, String lastName, Integer age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    //public abstract void haveLunch();


    public Person() {
        this.firstName = "Andrew";
        this.lastName = "Harris";
        this.age = 19;
        this.address = new Address("28", "city", "town", "poijdaf");
    }

    public void printAddress() {
        System.out.println(address.toString());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
