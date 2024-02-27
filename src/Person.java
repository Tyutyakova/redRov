import com.sun.source.tree.BreakTree;

public class Person {
  String gender;
  String name;
  int age;

  String getName() {
    String result;
    if (gender.equals("m")) {
      result = "Mr. " + name;
      return result;
    }  else if (gender.equals("w")) {
      result = "Ms. " + name;
      return result;
    }  else result = ("M or W " + name);
    return result;

  }


}
