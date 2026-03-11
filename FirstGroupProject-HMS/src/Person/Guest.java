package Person;

public class Guest extends Person {

    public Guest(String firstName, String middleName, String lastName,
                 String contactNumber, String email) {

        super(firstName, middleName, lastName, contactNumber, email);
    }


    @Override
    public void displayInfo() {
        System.out.println("Guest Name: " + getFullName());
        System.out.println("Contact #: " + getContactNumber());
        System.out.println("Email: " + getEmail());
    }
}