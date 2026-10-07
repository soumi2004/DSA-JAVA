package LeetCode;

import java.util.*;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {

                flowerbed[i] = 1;
                n--;
            }

            if (n == 0) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of positions: ");
        int size = sc.nextInt();

        int[] flowerbed = new int[size];

        System.out.print("Enter flowerbed values (0 or 1):");

        for (int i = 0; i < size; i++) {
            flowerbed[i] = sc.nextInt();
        }

        System.out.print("Enter number of flowers to plant: ");
        int n = sc.nextInt();

        boolean result = canPlaceFlowers(flowerbed, n);

        System.out.println("Can place flowers: " + result);

        sc.close();
    }
}
