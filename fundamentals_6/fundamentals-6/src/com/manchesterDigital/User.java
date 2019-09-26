package com.manchesterDigital;

public class User {

    private Long id;
    private String firstName;

    public User(String firstName) {
        this.firstName = firstName;

    }

    public String getFirstName() {
        return firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName = '" + firstName + '\'' +
                '}';
    }



}
