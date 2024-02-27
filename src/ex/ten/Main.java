package ex.ten;

public class Main {

    public static void main(String[] args) {
        Employee emOne = new Employee(40.0, "IIik",30.0);
        Worker workOne = new Worker( 40.0,"PIik",30.0);
        Manager one = new Manager(40.0, "Nik", 30.0, 0);

        System.out.println(emOne.getSalary());
        System.out.println(workOne.getSalary());
        System.out.println(one.getSalary());
        System.out.println(one.getName());

    }

}
