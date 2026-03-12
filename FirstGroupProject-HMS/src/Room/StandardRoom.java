package Room;

import RoomService.Invoice;

public class StandardRoom extends Room {

    public StandardRoom(int roomNumber) {
        super(roomNumber, 399.99);
    }

    @Override
    public String getName(){
        if(getGuest() != null) return "Standard Room #" + roomNumber + " -> Occupied by: " + getGuest().getFullName();
        return "Standard Room #" + roomNumber + " -> Occupied by: No One";
    }

    @Override
    public boolean removeGuest(){
        if(isAvailable){
            System.out.println("This room is has no occupant");
            return false;
        }else{
            Invoice inv = new Invoice("Standard Room", roomNumber, getGuest(), getStayDuration(), pricePerNight, getRoomServiceOrder());
            inv.printInvoice();
            deleteGuest();
            setDuration(0);
            setAvailability(true);
            return true;
        }
    }
}