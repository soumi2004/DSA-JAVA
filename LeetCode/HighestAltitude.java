package LeetCode;


import java.util.Scanner;

public class HighestAltitude {

    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int highest = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];

            if (altitude > highest) {
                highest = altitude;
            }
        }

        return highest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        System.out.println("Enter gain elements:");
        for (int i = 0; i < gain.length; i++) {
            gain[i] = sc.nextInt();
        }

        int result = largestAltitude(gain);

        System.out.println("Highest altitude: " + result);

        sc.close();
    }
}
