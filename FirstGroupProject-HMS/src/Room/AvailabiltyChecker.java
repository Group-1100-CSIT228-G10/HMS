package Room;

public class AvailabilityChecker {

    private Room room;

    public AvailabilityChecker(Room room) {
        this.room = room;
    }

    public boolean checkAvailability() {
        return room.isAvailable();
    }

    public void markAsReserved() {
        room.setAvailability(false);
    }

    public void markAsAvailable() {
        room.setAvailability(true);
    }
}