package Room;

import java.time.LocalDate;

public class Reservation {
    private int reservationID;
    private Room room;
    private StayDuration stay;
    private TotalRoomCost totalCost;
    private AvailabilityChecker availability;

    public Reservation(int reservationID, Room room, LocalDate checkIn, LocalDate checkOut) {
        this.reservationID = reservationID;
        this.room = room;
        this.stay = new StayDuration(checkIn, checkOut);
        this.availability = new AvailabilityChecker(room);
        this.totalCost = new TotalRoomCost(room, stay.calculateDays());
    }

    public boolean confirmReservation() {
        if (!availability.isAvailable()) {
            System.out.println("Room is not available.");
            return false;
        }

        if (stay.calculateDays() <= 0) {
            return false;
        }

        availability.setAvailability(false);
        System.out.println("Reservation confirmed.");
        return true;
    }

    public void cancelReservation() {
        availability.setAvailability(true);
        System.out.println("Reservation cancelled.");
    }

    public double getTotalCost() {
        return totalCost.calculate();
    }

    public long getStayDays() {
        return stay.calculateDays();
    }
}