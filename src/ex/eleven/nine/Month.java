package ex.eleven.nine;

public  class Month {
  private final String nameMonth;
  private final int allDaysMonth;
  private final int workDaysMonth;

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
