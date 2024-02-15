import com.sun.source.tree.BreakTree;

public class Salary {

  int getSum(Employee[] emplArr) {
    int sum = 0;
    for (int i = 0; i < emplArr.length; i++) {
      sum += emplArr[i].salary;
    }
    return sum;
  }

}
