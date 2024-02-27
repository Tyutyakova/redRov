package ex.ten;

public class Manager extends Worker {
    private int numberOfSubordinates;

    public Manager(double salary, String name, double baseSalary, int numberOfSubordinates) {
        super(salary, name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
    @Override
    public double getSalary(){
        if (getNumberOfSubordinates() == 0 ) return super.getSalaryOrigin();
        return super.getBaseSalary() * (getNumberOfSubordinates()  / 100.0 * 3);

    }
}
