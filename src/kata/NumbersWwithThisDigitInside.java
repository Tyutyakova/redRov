package kata;

import java.sql.Array;
import java.util.Arrays;

public class NumbersWwithThisDigitInside {
    public static void main(String[] args) {
        numberContainD(1, 11);

    }

    public static void numberContainD(int d, int x) {
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
                numbers =  numbers  + num + ",";
                sum = sum + num;
                product = product * num;
                k++;
        }

        }  arrFin[0] = k;
    arrFin[1] = sum;
arrFin[2] = product;

        System.out.println(numbers);
        System.out.println(Arrays.toString(arrFin));

    }


}
