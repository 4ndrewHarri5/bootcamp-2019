package com.manchesterDigital;

public class Windows98Machine {

    private final Keyboard standardKeyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard standardKeyboard, Monitor monitor) {
        this.standardKeyboard = standardKeyboard;
        this.monitor = monitor;
    }

    // now your windows class is tightly coupled to standardKeyboard and Monitor, since the class will always be standardKeyboard and Monitor, we cannot change these values in initalisation

    //this means that we can pass in any class that implements Keyboard, so it is a lot more versatile




}
