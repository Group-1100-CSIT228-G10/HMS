package Person;

public abstract class Person {
    public final String firstName;
    public final String middleName;
    public final String lastName;
    public String contactNumber;
    public String email;

    public Person(String firstName, String middleName, String lastName,
                  String contactNumber, String email) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public String getFullName() {
        if (middleName == null || middleName.isEmpty()) {
            return firstName + " " + lastName;
        }
        return firstName + " " + middleName + " " + lastName;
    }

    
    public abstract void displayInfo();
}
