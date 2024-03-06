package ex.ten;

public class Main {

    public static void main(String[] args) {
        Employee emOne = new Employee(40.0, "IIik",30.0);
        Worker workOne = new Worker( 40.0,"PIik",20.0);
        Manager one = new Manager( "Nik", 300.0, 0);
        Director main = new Director("Leo", 300.0, 0);
        Employee emOne1 = new Manager(22.4,"Lisa",33.3,5 );
        Employee[] arr = {emOne1,workOne,one,main};
        System.out.println(main.getSalary());


        System.out.println(emOne.getSalary());
        System.out.println(workOne.getSalary());
        System.out.println(one.getSalary());
        System.out.println(one.getName());
        System.out.println(main.getSalary());


        System.out.println(getCount("aeuut ttor"));
    }

    public static int getCount(String str) {
        int count = 0;
       for (int i = 0; str.length() > i; i++) {
           char ch = str.charAt(i);
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
               count++;
           }
       } return count;

    }

    }


