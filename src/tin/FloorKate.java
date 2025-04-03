package tin;

import java.util.Scanner;

public class FloorKate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOFloor = scan.nextInt();
        int timeForFirstClient = scan.nextInt();
        int[] allNumberOfClient = new int[countOFloor];
        for (int i = 0; i < allNumberOfClient.length; i++) {
            allNumberOfClient[i] = scan.nextInt();
        }
        int numberOfFirstClient = scan.nextInt();

        System.out.println(minCountFloor(allNumberOfClient, timeForFirstClient,numberOfFirstClient));

        //
    }
    public static int minCountFloor(int[] allNumberOfClient, int timeForFirstClient, int numberOfFirstClient) {
        int firstFloorInTime = allNumberOfClient[numberOfFirstClient - 1];
        int lastFloor = allNumberOfClient[allNumberOfClient.length - 1];
        int firstFloor = allNumberOfClient[0];

        if (firstFloorInTime < timeForFirstClient || lastFloor - firstFloorInTime <= timeForFirstClient) {
            return lastFloor - 1;
        } else if ((lastFloor - firstFloorInTime) < (firstFloorInTime - firstFloor)) {
            return (lastFloor - firstFloorInTime) * 2 + firstFloorInTime - firstFloor;
        } else {
            return (firstFloorInTime - firstFloor)*2 + lastFloor - firstFloorInTime;
        }
    }
}
