package oop;

public class AbstractClassUsage {

    public static void main(String[] args) {

        /* Following is not allowed and would raise error */
//        AbstractEmployee e = new AbstractEmployee("George W.", "Houston, TX", 43);
//        System.out.println("\n Call mailCheck using Employee reference--");
//        e.mailCheck();


        // After Salary2 defined
        Salary2 s = new Salary2("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        AbstractEmployee empl = new Salary2("John Adams", "Boston, MA", 2, 2400.00);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        empl.mailCheck();

    }

}

abstract class AbstractEmployee {
    private String name;
    private String address;
    private int number;

    public AbstractEmployee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    // Not usable on abstract Employee
    public double computePay() {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    // Abstract method sample usage
    // public abstract double computePay();

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}


class Salary2 extends AbstractEmployee {
    private double salary;   // Annual salary

    public Salary2(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
}