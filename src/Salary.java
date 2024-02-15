import com.sun.source.tree.BreakTree;

public class Salary {

  int getSum(Employee[] emplArr) {
    int summ = 0;
    for (int i = 0; i < emplArr.length; i++) {
      summ += emplArr[i].salary;
    }
    return summ;
  }

}
