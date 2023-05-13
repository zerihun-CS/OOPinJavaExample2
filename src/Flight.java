import java.util.HashMap;

public class Flight {
    int capacity;
    String flightCode;

    public Flight(int capacity, String flightCode) {
        this.capacity = capacity;
        this.flightCode = flightCode;
    }

    String flightType;
    String flightDestination;
    String flightOrigin;
    float flightTime;

    int seatNumber=1;

    HashMap<Integer, String> passengersList = new HashMap<>();

    void addPassenger(String passengerName){

        passengersList.put(seatNumber, passengerName);
        seatNumber++;
        System.out.println("Successfully Booked");


    }

    void viewPassenger(){

        System.out.println(passengersList);
    }






}
