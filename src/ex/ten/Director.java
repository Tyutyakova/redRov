package ex.ten;

public class Director extends Manager {

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(0.0, name, baseSalary, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (super.getNumberOfSubordinates() == 0 ) return super.getSalaryOrigin();
        return super.getBaseSalaryOrigin() * (super.getNumberOfSubordinates()  / 100.0 * 9);
    }
}
