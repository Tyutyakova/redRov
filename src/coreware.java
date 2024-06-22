import java.lang.reflect.Array;
import java.util.Arrays;

public class coreware {
//    public static int doubleInteger(int i) {
//        // Double the integer and return it!
//        return i * i;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(doubleInteger(6));
//    }
 public static void square(int num) {
  String begin = Integer.toString(num);
char[] charArray = begin.toCharArray();
  int[]  fin = new int[charArray.length];
  for (int i = 0; i < charArray.length; i++){
     fin[i] = Character.getNumericValue(charArray[i]) * Character.getNumericValue(charArray[i]);

  }
   System.out.println(Arrays.toString(fin));
 }

 public static void main(String[] args) {
   square(1234);
 // System.out.println(square(1254));
 }

}
