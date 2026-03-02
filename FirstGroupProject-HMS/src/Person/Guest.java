package Person;

public class Guest extends Person {

    private String guestType;
    private String status;

    public Guest(String id, String firstName, String middleName, String lastName,
                 String contactNumber, String email,
                 String guestType, String status) {

        super(id, firstName, middleName, lastName, contactNumber, email);
        this.guestType = guestType;
        this.status = status;
    }

    public String getGuestType() {
        return guestType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void displayInfo() {
        System.out.println("Guest ID: " + getId());
        System.out.println("Name: " + getFullName());
        System.out.println("Type: " + guestType);
        System.out.println("Status: " + status);
    }
}