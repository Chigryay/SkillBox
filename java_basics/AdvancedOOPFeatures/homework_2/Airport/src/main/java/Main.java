import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Airport a1 = Airport.getInstance();

        findPlanesLeavingInTheNextTwoHours(a1);
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {

        Date currentTime = new Date();
        return airport.getTerminals()
                .stream()
                .flatMap(t -> t.getFlights()
                        .stream())
                .filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE)
                        && currentTime.before(flight.getDate())
                        && flight.getDate().getTime() - currentTime.getTime() <= 7_200_000)
                .peek(System.out::println)
                .toList();
    }

}