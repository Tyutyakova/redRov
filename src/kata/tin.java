package kata;


import java.util.Scanner;

public class tin {

     public static void main(String[] args) {
         System.out.println(mobilCost());

    }
    public static int mobilCost () {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if (b >= d) {
            return a;
        }
        else return (a + c * (d - b));
    }
}

