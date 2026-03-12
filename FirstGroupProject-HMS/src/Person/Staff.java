package Person;

public class Staff extends Person {

    private double salary;
    public String shift;   

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
        if(salary < this.salary || salary <= 0 ){
            System.out.println("Cannot fullfill salary change");
            return;
        }
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
        System.out.println("Contact: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Salary: " + salary);
        System.out.println("Shift: " + shift);
    }
}
