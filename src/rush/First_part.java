package rush;
import java.util.Scanner;

public class First_part {
    public static void main(String[] args) {
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
        // if else
        /*//
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
    /*    String str = "10 20 40 60";
        Scanner scanner = new Scanner(str);
        String a = scanner.nextLine();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double t = scanner.nextDouble();
        System.out.println(a + b + c);*/
       /*  Scanner scan = new Scanner(System.in) ;
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
        }*/
        //Step_4 Определение существования треугольника
       /* String TRIANGLE_EXISTS = "треугольник существует";
        String TRIANGLE_NOT_EXISTS = "треугольник не существует";
        int a = 6;
        int b = 2;
        int c = 4;

        if ((a + b) > c && (a + c) > b && (b + c) > a ) {
            System.out.println(TRIANGLE_EXISTS);
        } else System.out.println(TRIANGLE_NOT_EXISTS);*/
        // Step_5 Тренарное выражение
           /* Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            String result = number < 5 ? "число меньше 5" : number > 5 ? "число больше 5" : "число равно 5";
            System.out.println(result);
        */
        // сравнение по модулю с задан.точностью
       /* Double a = 1.0000001;
        Double b = 1.00001002;
        if (Math.abs(a - b)< 0.000001) {
            System.out.println("числа равны");}
        else {
            System.out.println("числа не равны");}*/
        //вывод условий последовательно
        /*String string1 = "Амиго";
         String string2 = string1;
      String string3 = new String(string1);


            String same = "ссылки на строки одинаковые";
            String different = "ссылки на строки разные";
            if (string1 == string2) {
                System.out.println(same);}
            else {
                System.out.println(different);}

        if (string2 == string3) {
            System.out.println(same);}
        else {
            System.out.println(different);}
        if (string1 == string3) {
            System.out.println(same);}
        else {
            System.out.println(different);}*/
        //equals s1.equalsIgnoreCase(s2) _ while
       /* String quote = "Я никогда не буду работать за копейки. Амиго";
        int i = 0;
        while ( i < 100 ) {
            i++;
            System.out.println(quote);
        }*/
        // ввод цифр до ключевого слова и их сумма
       /*  int sum = 0;
        boolean isExist = false;
        Scanner scan = new Scanner(System.in);
        while (!isExist) {
            if (scan.hasNextInt()) {
                int a = scan.nextInt();
                sum += a;
            } else {
                String end = scan.nextLine();
                isExist = end.equals("ENTER");
            }
        }
        System.out.println(sum);*/
        //Незаполненный прямоугольник
       /* int a = 0;
        while (a < 10) {
            if (a == 0 || a == 9) {
                int b = 0;
                while (b < 19) {
                    System.out.print("Б");
                    b++;
                }
            } else {
                int c = 0;
                System.out.print("Б");
                while (c < 18) {
                    System.out.print(" ");
                    c++;
                }
            }
            System.out.print("Б");
            System.out.println();
            a++;*/
        //Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while
        /*int i = 0;
        int sum = 0;
        while (i < 100 ) {
            i++;
            if ( i % 3 == 0 ) {
                continue; }
            else {
                sum += i;

            }
        }   System.out.println(sum);*/
        //Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры
       /* Scanner scan = new Scanner(System.in);
        int min = 0 ;
        int min2 = 0;
        int min3 = Integer.MAX_VALUE;

        while ( scan.hasNextInt()) {
            int temp = scan.nextInt();
            min = temp;

            while (scan.hasNextInt()) {
                int sec = scan.nextInt();
                min2 = sec;

                if (min2 < min ) {
                    min3 = min;
                    min = min2;
            }   else if( min3 > min2 && min != min2)
            { min3 = min2;}
                }


            System.out.println( min3);
        }*/
      /*  Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            int tmp = console.nextInt();
            if (tmp < min) {
                secondMin = min;
                min = tmp;
            } else if (tmp > min && tmp < secondMin) {
                secondMin = tmp;
            }
        }

        System.out.println(secondMin);
    }*/


        }
    }



