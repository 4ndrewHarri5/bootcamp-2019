package com.manchesterDigital;

public class MotorCar implements MoveVehicle, HasEngine {

    private Engine engine;

    public void startEngine() {
        engine.on();
    }

    public void accelerate() {
        engine.powerOn(2000);
    }

}
