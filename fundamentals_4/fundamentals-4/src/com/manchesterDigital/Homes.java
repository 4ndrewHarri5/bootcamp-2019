package com.manchesterDigital;

public class Homes implements ShowMessage {

    public static void main(String[] args) {

        People andrew = new People("Andrew", "Harris", 19);
        People rachel = new People("Rachel", "Harris", 15);
        People john = new People("John", "Harris", 24);

        Car fabia = new Car("Skoda Fabia 2003", "2003", andrew);
        Car zafira = new Car("Zafria", "2008", john);

        People [] allLiving = {john, andrew, rachel};
        Car [] allCars = {fabia, zafira};

        Home harris = new Home("28", "Harvest Drive", allLiving, allCars);

        int a = 1;
        int b = 10
        for(int i = a...b) {

        }

    }

    public void message(){



    }

    public void houseNumber(String houseNumber) {

    }

    public void peopleLivingThere(People[] allLiving) {

    }
}

interface ShowMessage {

    void houseNumber(String houseNumber);
    void peopleLivingThere(People [] allLiving);


}
