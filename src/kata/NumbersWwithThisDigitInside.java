package kata;

import java.sql.Array;
import java.util.Arrays;

public class NumbersWwithThisDigitInside {
    // 2 способа нахождения цифры в заданном массиве чисел
    public static void main(String[] args) {
        System.out.println(Arrays.toString(NumbersWithDigitInside2(4, 6)));
//        System.out.println(containDigit(2, 9));

    }
    // first metod
    public static long[] NumbersWithDigitInside2(long x, long d) {

        long sum = 0;
        long product = 1;
        long count = 0;
        //if (d > x) return new long[] {0, 0, 0};

        for (int i = 1; i <= x; i++) {
            if (containDigit(d, i)) {
                count++;
                sum += i;
                product *= i;
            }
        }
        if (count == 0) product = 0;
        return new long[]{count, sum, product};
    }


    private static boolean containDigit(long d, long num) {
        while (num > 0) {
            if (num % 10 == d) {
                return true;
            } else num /= 10;
        }
        return false;
    }

    //second metod
    public static int[] NumbersWithDigitInside(int d, int x) {
        int arrAll[] = new int[x];
        int arrFin[] = new int[3];
        int sum = 0;
        int product = 1;
        String numbers = "Numbers:";
        int k = 0;
        // преобразуем число в подстроку string
        String strToFind = Integer.toString(d);
        for (int i = 1; i <= x; i++) {
            arrAll[i - 1] = i;
        }
        for (int num : arrAll) {
            if (Integer.toString(num).contains(strToFind)) {
                numbers = numbers + num + ",";
                sum = sum + num;
                product = product * num;
                k++;
            }
        }
        arrFin[0] = k;
        arrFin[1] = sum;
        arrFin[2] = product;
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(arrFin));
        return arrFin;
    }

}
