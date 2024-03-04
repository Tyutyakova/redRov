package ex.eleven.nine;

public class Manager {
  private String gender;
  private String name;
  private int age;
  private double salaryDay;
  private int workers;

  public String getGender() {
    return gender;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getSalaryDay() {
    return salaryDay;
  }

  public int getWorkers() {
    return workers;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSalaryDay(double salaryDay) {
    this.salaryDay = salaryDay;
  }

  public void setWorkers(int workers) {
    this.workers = workers;
  }
  public double getSalary(Month[] monthArray){
    double sum = 0;
    for (int i = 0; monthArray.length > i; i++) {
      sum += monthArray[i].getWorkDaysMonth() * salaryDay;
    }
    return sum += sum * 0.01 * workers;
  }
}
