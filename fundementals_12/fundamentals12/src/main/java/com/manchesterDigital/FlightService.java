package com.manchesterDigital;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class FlightService {

    private static Map<String, FlightInformation> flights;

    static {

        //initialised anything within a static context, before anything is run

        flights = Map.of(
                "AB123", new FlightInformation("AB123"),
                "XK867", new FlightInformation("XK867"),
                "ST009", new FlightInformation("ST009")
        );

    }


    public FlightInformation retrieveFlight(final String flightNo) {
        return flights.get(flightNo);
    }


    /*public Airline retrieveAirline(final String flightNo){
        FlightInformation flight = retrieveFlight(flightNo);

        if(!flight.getAirline().isPresent())  {
            throw new AirlineNotFoundException();
        }

        return flight.getAirline().get();

    }*/

    /*public Airline retrieveAirline(final String flightNo){
        FlightInformation flight = retrieveFlight(flightNo);

        return flight.getAirline().orElseThrow(AirlineNotFoundException::new);

        // have you got an optional value, no? otherwise give me something else

    }*/

    /*public Airline retrieveAirline(final String flightNo){
        FlightInformation flight = retrieveFlight(flightNo);

        return flight.getAirline().orElseThrow(() -> new AirlineNotFoundException("No flight found"));

        //says return me the airline im looking for, or return me an empty one

        // have you got an optional value, no? otherwise give me something else

    }*/

    public Airline retrieveAirline(final String flightNo){
        FlightInformation flight = retrieveFlight(flightNo);

        return flight.getAirline().orElse(new Airline());

        //says return me the airline im looking for, or return me an empty one

        // have you got an optional value, no? otherwise give me something else

    }

}
