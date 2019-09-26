package com.manchesterDigital;

public class UserNotFoundException extends RuntimeException{


    public UserNotFoundException(String message) {
        super(message); //super refers to RuntimeException class, super is the parent
    }
}
