public class Main {
  public static void main(String[] args) {
    Person man = new Person();
    man.name = "Nik";
    man.gender = "m";
    man.age = 29;

    Person women = new Person();
    women.age = 19;
    women.name = "Lila";
    women.gender = "w";

    Person some = new Person();
    some.gender = "d";
    some.name = "Gey";
    some.age = 39;

    System.out.println(man.getName());
    System.out.println(women.getName());
    System.out.println(some.getName());

  }
}
