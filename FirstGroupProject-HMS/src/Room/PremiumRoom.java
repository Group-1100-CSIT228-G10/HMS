package Room;

public class PremiumRoom extends Room {

    public PremiumRoom(int roomNumber) {
        super(roomNumber, 799.99);
    }

    public String getName(){
        return "Premium Room #" + getRoomNumber();
    }
}