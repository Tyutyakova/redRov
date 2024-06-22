package kata;

public class Summ {
  public static int sum(int[] numbers)
  {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int sum = 0;
    if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
          for (int i = 0; numbers.length > i; i++) {
            sum += numbers[i];
            if (numbers[i] > max) {
              max = numbers[i];
            }
            if (numbers[i] < min) {
              min = numbers[i];
            }
          }
        sum = sum - min - max;

    System.out.println(min + " " + max);
    return sum;
  }

  public static void main(String[] args) {
    int[] num = {1,2,5,8,7,4,9,6,11};
    int[] min = {};
    System.out.println(Summ.sum(num));
    System.out.println(Summ.sum(min));

  }
}
