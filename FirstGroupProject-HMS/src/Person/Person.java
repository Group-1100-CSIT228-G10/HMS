package Person;

public abstract class Person {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private String contactNumber;
    private String email;

    public Person(String firstName, String middleName, String lastName,
                  String contactNumber, String email) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        if (middleName == null || middleName.isEmpty()) {
            return firstName + " " + lastName;
        }
        return firstName + " " + middleName + " " + lastName;
    }

    
    public abstract void displayInfo();
}
