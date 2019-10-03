package com.manchesterDigital;

public class ElectricCar implements MoveVehicle {

    private Engine engine;

    public void accelerate() {
        engine.powerOn(3000);
    }
}
