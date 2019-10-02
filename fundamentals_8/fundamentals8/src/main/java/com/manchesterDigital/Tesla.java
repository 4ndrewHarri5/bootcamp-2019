package com.manchesterDigital;

public class Tesla extends Vehicle implements Movement, IsChargable {

    public Tesla(Colour colour, Integer seats, TransmissionType transmissionType, Double engineSize, Manufacturer manufacturer) {
        super(colour, seats, transmissionType, engineSize, manufacturer);
    }

    public void moveForward() {

    }

    public void reverse() {

    }

    public void supercharge() {
        System.out.println("supercharging");
    }

}
