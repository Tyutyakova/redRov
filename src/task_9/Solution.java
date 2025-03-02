package task_9;


import static task_9.MonthUtils.*;


public class Solution {

  public static void main(String[] args) {
    Month[] win = WINTER;
    Month[] spr = {MAR};
    Employee firstEmpl = new Employee("Фёдор", 14);
    Employee seconfEmpl = new Employee("Пётр", 36, "M", 16);
    Manager firstMan = new Manager("Лия", 14, 1);
    System.out.println(firstEmpl.getName() + " - зп \\ дек. янв. февр \\ " + firstEmpl.getSalary(win));
    System.out.println(firstEmpl.getName() + " - зп \\ март \\ " + firstEmpl.getSalary(spr));
    System.out.println(firstMan.getName() + " - зп \\ дек. янв. февр \\ " + firstMan.getSalary(win));
    System.out.println(firstMan.getName() + " - зп \\ дек. янв. февр \\ " + firstMan.getSalary(spr));
    Manager newMan = firstEmpl.convertToManager(1);
    System.out.println(newMan.getName() + " - зп \\ дек. янв. февр \\ " + newMan.getSalary(spr));

  }
  }
