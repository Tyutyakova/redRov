package ex.ten;

public class Main {

    public static void main(String[] args) {
        Employee emOne = new Employee(40.0, "IIik",30.0);
        Worker workOne = new Worker( 40.0,"PIik",20.0);
        Manager one = new Manager( "Nik", 300.0, 1);
        Director main = new Director("Leo", 300.0, 1);

        System.out.println(emOne.getSalary());
        System.out.println(workOne.getSalary());
        System.out.println(one.getSalary());
        System.out.println(one.getName());
        System.out.println(main.getSalary());

    }

}
