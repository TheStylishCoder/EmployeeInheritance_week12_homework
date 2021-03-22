package staff;

public class Employee {

    public String name;
    public String nationalInsuranceNumber;
    public double salary;

    public Employee(String name, String nationalInsuranceNumber, double salary){
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double increaseAmount){
        setSalary(this.salary + increaseAmount);
    }

    public double payBonus(){
        return salary / 100;
    }
}
