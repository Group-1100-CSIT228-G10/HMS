package Person;

public class Staff extends Person {

    private String role;
    private double salary;
    private String shift;   

    public Staff(String id, String firstName, String middleName, String lastName,
                 String contactNumber, String email,
                 String role, double salary, String shift) {

        super(id, firstName, middleName, lastName, contactNumber, email);
        this.role = role;
        this.salary = salary;
        this.shift = shift;
    }


    public String getRole(){ 
        return role;
    }

    public void setRole(String role){
         this.role = role;
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
        System.out.println("Staff ID: " + getId());
        System.out.println("Name: " + getFullName());
        System.out.println("Contact: " + getContactNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
        System.out.println("Shift: " + shift);
    }
}
