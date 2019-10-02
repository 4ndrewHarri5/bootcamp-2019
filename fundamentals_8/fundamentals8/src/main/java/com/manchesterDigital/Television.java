package com.manchesterDigital;

public class Television extends Device implements PowerControls, StandbyControls, VolumeControls, ChannelControls {

    public Television(String deviceName, Long serialNumber) {
        super(deviceName, serialNumber);
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing the channel of the TV");
    }

    @Override
    public void switchOn() {
        System.out.println("Switching on the TV");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off the TV");

    }

    @Override
    public void standbyMode() {
        System.out.println("TV on Standby Mode");
    }

    @Override
    public void volumeUp() {
        System.out.println("Turn Volume up on TV");
    }

    @Override
    public void volumeDown() {
        System.out.println("Turn volume down on TV");
    }
}
