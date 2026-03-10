package Room;

public abstract class Room {

    private int roomNumber;
    private double pricePerNight;
    private boolean isAvailable;

    public Room(int roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true; 
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
  
    public void setAvailability(boolean status) {
        this.isAvailable = status;
    }

    public double calculateCost(int numberOfDays) {
        return pricePerNight * numberOfDays;
    }

    public abstract String getName();
}