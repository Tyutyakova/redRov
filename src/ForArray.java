import java.util.Arrays;

public class ForArray {
  public static void main (String args [] ) {

  int[] ari = {9, 2, 6, 4, 5, 12, 7, 8, 6};
  int[] arrii = new int[9];

    System.out.print(" нечетные числа: ");
  for (int i = 0; i < ari.length; i++ ) {
    if ( ari[i] % 2 != 0) {
      System.out.print( ari[i] + " ");
      arrii[i] = ari[i];
    }
  }
  System.out.println( Arrays.toString(arrii) );

/*
for (int i = 0; i < ari.length; i++) {
  ari[i] = ari[i] + 15;
}
    int a = ari[0];
    ari[0] = ari[8];
    ari[8] = a;

System.out.println( Arrays.toString(ari) );
  */
  }
}
