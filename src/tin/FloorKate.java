package tin;

import java.util.Scanner;

public class FloorKate {
    public static void main(String[] args) {
      /*  Scanner scan = new Scanner(System.in);
        int countOFloor = scan.nextInt();
        int timeForFirstClient = scan.nextInt();
        int[] allNumberOfClient = new int[countOFloor];
        for (int i = 0; i < allNumberOfClient.length; i++) {
            allNumberOfClient[i] = scan.nextInt();
        }
        int numberOfFirstClient = scan.nextInt();

        System.out.println(minCountFloor(allNumberOfClient, timeForFirstClient,numberOfFirstClient));*/
        System.out.println(minCountFloor(new int[] {1,2,4,6,8,10}, 4,6));
        System.out.println(minCountFloorSecondVar(new int[] {1,2,4,6,8,10}, 4,6));

    }
    public static int minCountFloor(int[] allNumberOfClient, int timeForFirstClient, int numberOfFirstClient) {
        int firstFloorInTime = allNumberOfClient[numberOfFirstClient - 1];
        int lastFloor = allNumberOfClient[allNumberOfClient.length - 1];
        int firstFloor = allNumberOfClient[0];

        if (firstFloorInTime < timeForFirstClient || lastFloor - firstFloorInTime <= timeForFirstClient) {
            return lastFloor - firstFloor;
        } else if ((lastFloor - firstFloorInTime) < (firstFloorInTime - firstFloor)) {
            return (lastFloor - firstFloorInTime) * 2 + firstFloorInTime - firstFloor;
        } else {
            return (firstFloorInTime - firstFloor)*2 + lastFloor - firstFloorInTime;
        }
    }

    public static int minCountFloorSecondVar(int[] allNumberOfClient, int timeForFirstClient, int numberOfFirstClient) {
        int targetFloor = allNumberOfClient[numberOfFirstClient - 1];
        int minFloor = allNumberOfClient[0];
        int maxFloor = allNumberOfClient[allNumberOfClient.length - 1];

        // Вариант 1: Начать с minFloor, идти до maxFloor
        int timeToTarget1 = targetFloor - minFloor;
        int totalStairs1 = maxFloor - minFloor;
        boolean option1Valid = timeToTarget1 <= timeForFirstClient;

        // Вариант 2: Начать с maxFloor, идти до minFloor
        int timeToTarget2 = maxFloor - targetFloor;
        int totalStairs2 = maxFloor - minFloor;
        boolean option2Valid = timeToTarget2 <= timeForFirstClient;

        // Вариант 3: Начать с targetFloor, затем вниз до minFloor, затем вверх до maxFloor
        int totalStairs3 = (targetFloor - minFloor) + (maxFloor - minFloor);
        boolean option3Valid = true; // время до target 0

        // Вариант 4: Начать с targetFloor, затем вверх до maxFloor, затем вниз до minFloor
        int totalStairs4 = (maxFloor - targetFloor) + (maxFloor - minFloor);
        boolean option4Valid = true; // время до target 0

        // Находим минимальное значение среди допустимых вариантов
        int minStairs = Integer.MAX_VALUE;
        if (option1Valid) {
            minStairs = Math.min(minStairs, totalStairs1);
        }
        if (option2Valid) {
            minStairs = Math.min(minStairs, totalStairs2);
        }
        if (option3Valid) {
            minStairs = Math.min(minStairs, totalStairs3);
        }
        if (option4Valid) {
            minStairs = Math.min(minStairs, totalStairs4);
        }

        return minStairs;
    }
}
