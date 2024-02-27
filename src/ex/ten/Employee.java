package ex.ten;

public class Employee {
     private double salary;
    private String name;
    private double baseSalary;

    public Employee(double salary, String name, double baseSalary) {
        this.salary = salary;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    };

        public String getName() {
        return this.name;
    };

    public void setName(String name) {
        this.name = name;
    }

    public  double getSalary() {
        return this.salary;
    }


}
