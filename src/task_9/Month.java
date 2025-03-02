package task_9;

public class Month {
  private final String name;
  private final int workDay;
  private final int allDay;

  public Month(String name, int allDay, int workDay ) {
    this.name = name;
    this.workDay = workDay;
    this.allDay = allDay;
  }

  public String getName() {
    return name;
  }

  public int getWorkDay() {
    return workDay;
  }

  public int getAllDay() {
    return allDay;
  }


}
