public class Employee {
  int salary;
  Person member;

  Boolean isSameName(Employee employee) {
     boolean a =  employee.member.name.equals(member.name);
    return a;
  }
}

