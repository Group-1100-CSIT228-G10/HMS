package Room;

import Person.*;

public abstract class Room {

    private final int roomNumber;
    private final double pricePerNight;
    private boolean isAvailable;
    private Guest guest;
    private int stayDuration;

    public Room(int roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true; 
        guest = null;
        stayDuration = 0;
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

    public Guest getGuest() {
        return guest;
    }

    public int getStayDuration(){
        return stayDuration;
    }

    public boolean addGuest(Guest g){
        if(isAvailable){
            this.guest = g;
            setAvailability(false);
            return true;
        }else{
            System.out.println("This room is occupied by " + guest.getFirstName());
            return false;
        }
    }

    public void deleteGuest(){
        this.guest = null;
    }

    public abstract boolean removeGuest();
    

    public boolean setDuration(int duration){
        if(!isAvailable){
            stayDuration = duration;
            return true;
        }else{
            System.out.println("Cannot set a stay duration on an empty room");
            return false;
        }
    }
  
    public void setAvailability(boolean status) {
        this.isAvailable = status;
    }


    public abstract String getName();
}