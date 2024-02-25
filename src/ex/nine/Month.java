package ex.nine;

public class Month {
  private String nameMonth;
  private int allDaysMonth;
  private int workDaysMonth;

  public Month(String nameMonth, int allDaysMonth, int workDaysMonth) {
    this.nameMonth = nameMonth;
    this.allDaysMonth = allDaysMonth;
    this.workDaysMonth = workDaysMonth;
  }

  public String getNameMonth() {
    return nameMonth;
  }

  public int getAllDaysMonth() {
    return allDaysMonth;
  }

  public int getWorkDaysMonth() {
    return workDaysMonth;
  }
}
