package com.manchesterDigital;

public class Home {

    String houseNumber;
    String address;
    People [] peopleLivingInTheHouse;
    Car [] carsAtHome;

    public Home(String houseNumber, String address,People[] peopleLivingInTheHouse, Car[] carsAtHome) {
        this.houseNumber = houseNumber;
        this.address = address;
        this.peopleLivingInTheHouse = peopleLivingInTheHouse;
        this.carsAtHome = carsAtHome;
    }

}
