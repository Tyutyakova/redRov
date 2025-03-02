package task_9;

public class Manager {
  private final String name;
  private  int summeryInDay;
  private Integer age = null;
  private String sex = null;
  private Integer countSubordinate = null;

  public Manager(String  name, int summeryInDay, Integer countSubordinate,Integer age, String sex ) {
    this.name = name;
    this.summeryInDay = summeryInDay;
    this.countSubordinate = countSubordinate;
    this.age = age;
    this.sex = sex;

  }

  public Manager(String name, int summeryInDay, Integer countSubordinate) {
    this.name = name;
    this.summeryInDay = summeryInDay;
    this.countSubordinate = countSubordinate;
  }
public String getName() {
    return name;
  }

  public int getSummeryInDay() {
    return summeryInDay;
  }

  public Integer getAge() {
    return age;
  }

  public String getSex() {
    return sex;
  }

  public Integer getCountSubordinate() {
    return countSubordinate;
  }

  public double getSalary (Month[] arrayMohth) {
    double temp =0.0;
    for (Month month: arrayMohth) {
      temp += month.getWorkDay() * this.summeryInDay + (month.getWorkDay() * this.summeryInDay) * 0.01 * this.countSubordinate;
    } return temp;

  }


}
