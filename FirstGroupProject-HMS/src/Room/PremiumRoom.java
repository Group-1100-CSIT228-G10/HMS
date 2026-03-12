package Room;

import RoomService.Invoice;

public class PremiumRoom extends Room {

    public PremiumRoom(int roomNumber) {
        super(roomNumber, 799.99);
    }

    @Override
    public String getName(){
        if(getGuest() != null) return "Premium Room #" + roomNumber + " -> Occupied by: " + getGuest().getFullName();
        return "Premium Room #" + roomNumber + " -> Occupied by: No One";
    }

    @Override
    public boolean removeGuest(){
        if(isAvailable){
            System.out.println("This room is has no occupant");
            return false;
        }else{
            Invoice inv = new Invoice("Premium Room", roomNumber, getGuest(), getStayDuration(), pricePerNight, getRoomServiceOrder());
            inv.printInvoice();
            deleteGuest();
            setDuration(0);
            setAvailability(true);
            return true;
        }
    }
}