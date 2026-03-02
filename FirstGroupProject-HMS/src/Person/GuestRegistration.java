package Person;

import java.util.ArrayList;

public class GuestRegistration {

    private ArrayList<Guest> guests;

    public GuestRegistration() {
        guests = new ArrayList<>();
    }

    public void registerGuest(Guest guest) {
        guests.add(guest);
        System.out.println("Guest registered: " + guest.getFullName());
    }

    public Guest findGuestById(String id) {
        for(Guest g : guests) {
            if (g.getId().equals(id)) return g;
        }
        return null;
    }

    public void displayAllGuests() {
        for(Guest g : guests) {
            g.displayInfo();
            System.out.println("------------------");
        }
    }
}