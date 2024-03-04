package ex.ten;

public class Manager extends Worker {
    private int numberOfSubordinates;

    public Manager(double salary, String name, double baseSalary, int numberOfSubordinates) {
        super(salary, name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public Manager(String name, double baseSalary, int numberOfSubordinates){
        super(0.0, name, baseSalary);
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
        if (getNumberOfSubordinates() == 0 ) return super.getSalary();
        return getBaseSalary() * (getNumberOfSubordinates()  / 100.0 * 3);

    }


}
