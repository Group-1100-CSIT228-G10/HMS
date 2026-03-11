package Person;

public class Staff extends Person {

    private double salary;
    private String shift;   

    public Staff(String firstName, String middleName, String lastName,
                 String contactNumber, String email, double salary,
                 String shift) {

        super(firstName, middleName, lastName, contactNumber, email);
        this.salary = salary;
        this.shift = shift;
    }

    public double getSalary() { 
        return salary;
    }
    public void setSalary(double salary){ 
        this.salary = salary;
    }
    public String getShift(){ 
        return shift;
    }
    public void setShift(String shift){ 
        this.shift = shift;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getFullName());
        System.out.println("Contact: " + getContactNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Salary: " + salary);
        System.out.println("Shift: " + shift);
    }
}
