package Room;

import RoomService.*;

public class VIPRoom extends Room {

    public VIPRoom(int roomNumber) {
        super(roomNumber, 1299.99);
    }

    @Override
    public String getName(){
        if(getGuest() != null) return "VIP Room #" + getRoomNumber() + " -> Occupied by: " + getGuest().getFullName();
        return "VIP Room #" + getRoomNumber() + " -> Occupied by: No One";
    }

    @Override
    public boolean removeGuest(){
        if(isAvailable()){
            System.out.println("This room is has no occupant");
            return false;
        }else{
            Invoice inv = new Invoice("VIP Room", getRoomNumber(), getGuest(), getStayDuration(), getPricePerNight(), getRoomServiceOrder());
            inv.printInvoice();
            deleteGuest();
            setDuration(0);
            setAvailability(true);
            return true;
        }
    }
}