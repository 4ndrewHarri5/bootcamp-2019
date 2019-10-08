package com.manchesterDigital;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@Builder
public class User {

    private String firstname;
    private String lastname;
    private Integer age;
    private String uid;

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", uid='" + uid + '\'' +
                '}';
    }
}
