public class IfElse {
    public static void main(String[] args) {
//    int k = 0;
//    double t = 10.2;
//    float r = 10.5f;
//    long e = 7;
//
//        for ( int i = 0;  i < 3; i = i+ 1) {
//            System.out.print("JAVA_for ");
////        }
//        while (  k <= 3 ) {
//            k = k + 1;
//            System.out.println("JAVA_while");
//        }

int a = 45;
int b = 140;
//if ( a == b ) {
//    System.out.println (a + " == " + b);
//}
//else if ( a < b ) {
//    System.out.println ( a + " < " + b );
//}
//else if ( a > b ) {
//    System.out.println ( a + " > " + b );
//}


//if ( ((a + b) % 2) == 0 ) {
//    System.out.println(" maybe a and b are even");
//}
//else  {
//    System.out.println(" some variable is odd ");
//        }
boolean dev = ( a / 2  > 20 );

if ( dev == true ) {
    System.out.println(" результат деления на 2 больше 20 ");
}

if (  a  > 10 ) {
   System.out.println( " переменная больше 10" );
}
if ( a  < 100 ) {
    System.out.println( " переменная меньше 100");
        }
if ( a >= 5 & a <= 40 ) {
    System.out.println( " значение переменной между 5 и 40 включительно");
}
else { a += 2 ;
    System.out.println( " значение переменной меньше 5 или больше 40 " + a );
        }


    }
}