package com.manchesterDigital;

public class Toyota extends Vehicle implements Movement {

    public Toyota(Colour colour, Integer seats, TransmissionType transmissionType, Double engineSize, Manufacturer manufacturer) {
        super(colour, seats, transmissionType, engineSize, manufacturer);
    }

    public void moveForward() {
        System.out.println("Reversing Toyota");
    }

    public void reverse() {
        System.out.println("Reversing Toyota");
    }

}
