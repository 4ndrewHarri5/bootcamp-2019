package com.manchesterDigital;

public class Mobile extends Device implements PowerControls, StandbyControls, VolumeControls {
    public Mobile(String deviceName, Long serialNumber) {
        super(deviceName, serialNumber);
    }

    @Override
    public void switchOn() {
        System.out.println("Switching on Mobile");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off Mobile");
    }

    @Override
    public void standbyMode() {
        System.out.println("Mobile in standby");
    }

    @Override
    public void volumeUp() {
        System.out.println("Turn volume up on Mobile");
    }

    @Override
    public void volumeDown() {
        System.out.println("Turn volume down on Mobile");
    }
}
