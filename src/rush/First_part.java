package rush;
import java.util.Scanner;

public class First_part {
    public static void main (String[] args){
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("VVod  ");
        String name = scanner.nextLine();
        System.out.println("namee " + name.toLowerCase());
        System.out.println("Vvod int ");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println("int a = " + a);
        }
            else  { System.out.println("It is non Int");}*/
/*// step_2
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        boolean isLow = (bodyTemperature < 36);
        boolean isHigh = (bodyTemperature > 37);
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }*/


        /*String str = "10 20 40 60";
        Scanner scanner = new Scanner(str);
        String a = scanner.nextLine();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a + b + c);
*/

        //step_3
        Scanner scan = new Scanner(System.in) ;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ( a == b && b == c) {
            System.out.println(a+ " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a+ " " + b);
        } else if (b == c ) {
            System.out.println(b + " " + c);
        } else if (a == c) {
            System.out.println(a+ " " + c);
        }



    }
    }

