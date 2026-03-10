package Person;

import java.util.HashMap;
import Room.*;

public class ReservationAssignment {

    private HashMap<Room, Guest> reservations;

    public ReservationAssignment() {
        reservations = new HashMap<>();
    }

    public void assignGuest(Room room, Guest guest) {
        reservations.put(room, guest);
        System.out.print("Guest " + guest.getFullName() + " assigned to Reservation ");
        if(room instanceof StandardRoom)      System.out.println(((StandardRoom)room).getName());
        else if(room instanceof PremiumRoom)  System.out.println(((PremiumRoom)room).getName());
        else if(room instanceof VIPRoom)      System.out.println(((VIPRoom)room).getName());
    }

    public Guest getGuestByReservation(Room room) {
        return reservations.get(room);
    }

    public void displayAllReservations() {
        for(Room room : reservations.keySet()) {
            System.out.print("Room Reservation: ");
            if(room instanceof StandardRoom)      System.out.println(((StandardRoom)room).getName());
            else if(room instanceof PremiumRoom)  System.out.println(((PremiumRoom)room).getName());
            else if(room instanceof VIPRoom)      System.out.println(((VIPRoom)room).getName());
            
            reservations.get(room).displayInfo();
            System.out.println("------------------");
        }
    }
}