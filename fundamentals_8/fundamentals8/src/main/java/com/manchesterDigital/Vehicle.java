package com.manchesterDigital;

public abstract class Vehicle {

    private final Colour colour;
    private final Integer seats;
    private final TransmissionType transmissionType;
    private final Double engineSize;
    private final Manufacturer manufacturer;

    public Vehicle(Colour colour, Integer seats, TransmissionType transmissionType, Double engineSize, Manufacturer manufacturer) {
        this.colour = colour;
        this.seats = seats;
        this.transmissionType = transmissionType;
        this.engineSize = engineSize;
        this.manufacturer = manufacturer;
    }

}
