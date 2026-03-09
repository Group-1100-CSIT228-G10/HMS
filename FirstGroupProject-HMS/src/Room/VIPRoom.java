package Room;

public class VIPRoom extends Room {

    public VIPRoom(int roomNumber) {
        super(roomNumber, 1299.99);
    }

    public String getName(){
        return "VIP Room #" + getRoomNumber();
    }
}