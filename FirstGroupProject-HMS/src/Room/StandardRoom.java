package Room;

public class StandardRoom extends Room {

    public StandardRoom(int roomNumber) {
        super(roomNumber, 399.99);
    }

    public String getName(){
        return "Standard Room #" + getRoomNumber();
    }
}