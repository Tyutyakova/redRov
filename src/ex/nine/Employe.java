package ex.nine;

public class Employe {

  private String gender;
  private String name;
  private int age;
  private double salaryDay;

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
  public double  getSalary(Month[] monthArray) {
    int sumForMonth = 0;
    for(int i = 0; monthArray.length > i; i++) {
      sumForMonth += monthArray[i].getWorkDaysMonth() * salaryDay ;
    }
    return sumForMonth;
  }
}
