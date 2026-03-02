package Person;

import java.util.HashMap;

public class ReservationAssignment {

    private HashMap<String, Guest> reservations;

    public ReservationAssignment() {
        reservations = new HashMap<>();
    }

    public void assignGuest(String reservationId, Guest guest) {
        reservations.put(reservationId, guest);
        System.out.println("Guest " + guest.getFullName() + " assigned to Reservation " + reservationId);
    }

    public Guest getGuestByReservation(String reservationId) {
        return reservations.get(reservationId);
    }

    public void displayAllReservations() {
        for(String resId : reservations.keySet()) {
            System.out.println("Reservation ID: " + resId);
            reservations.get(resId).displayInfo();
            System.out.println("------------------");
        }
    }
}