package task_9;

import com.sun.source.tree.BreakTree;

public class Employee {
  private final String name;
   Integer age = null;
   String sex = null;
  private int summeryInDay;

  public Employee(String name, int summeryInDay) {
    this.name = name;
    this.summeryInDay = summeryInDay;
  }

  public Employee(String name, Integer age, String sex, int summeryInDay) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.summeryInDay = summeryInDay;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public String getSex() {
    return sex;
  }

  public int getSummeryInDay() {
    return summeryInDay;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public int getSalary (Month[] monthArray) {
    int temp = 0;
    for(Month month: monthArray){
   temp += this.summeryInDay * month.getWorkDay();
    } return temp;
  }
  public Manager convertToManager(int numberOfSubordinates){
   return new Manager(this.name, this.summeryInDay,numberOfSubordinates, this.age, this.sex);
  }
}
