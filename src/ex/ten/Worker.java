package ex.ten;

public class Worker extends Employee {

  public Worker(double salary, String name, double baseSalary ) {
      super(salary, name, baseSalary);
  }

  public double getSalaryOrigin() {
      return super.getSalary();
  };
    @Override
    public double getSalary() {
     return super.getBaseSalary();
    }

}
