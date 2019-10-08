package com.manchesterDigital;

import java.util.Optional;

public class Airport {

    public static void main(String[] args) {
        FlightService flightService = new FlightService();

        FlightInformation flight = flightService.retrieveFlight("AB123");

        System.out.println("flight = " + flight.getAirline().get().getName());

        Optional<FlightInformation> flight1 = Optional.of(flight);
        // says what ever you arte doing may come back as null so leave it as null
        //may have a flight info which could be null

        Optional<FlightInformation> flight2 = Optional.ofNullable(flight);
        //for something that may be null, but you dont care if it is null


    }

}
