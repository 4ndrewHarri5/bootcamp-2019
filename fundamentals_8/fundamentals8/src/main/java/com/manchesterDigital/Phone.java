package com.manchesterDigital;

public class Phone {

    //receieve text
    // send text
    // receive call
    // outgoing call
    // open app
    // open browser


    public void receiveText(Caller from){

        System.out.println("receiving text from " + from.getAreaCode() + from.getNumber());

    }

    public void sendText(Caller to, String message) {
        System.out.println("sending text: '" + message + "' to " + to.getAreaCode() + to.getNumber());
    }

    public void receiveCall(Caller from){

        System.out.println("Receiving call from " + from.getAreaCode() + from.getNumber());

    }

    public void makeCall(Caller to) {
        System.out.println("calling: " + to.getAreaCode() + to.getNumber());
    }

    public void changeBightness(Integer to){

        System.out.println("Phone brightness set to " + to + "%");

    }

    public void openApp(App appName) {
        System.out.println("opening app called: " + appName.getName() + " with id: " + appName.getId());
    }



}
