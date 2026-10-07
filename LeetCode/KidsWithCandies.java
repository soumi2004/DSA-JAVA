package LeetCode;

import java.util.*;

public class KidsWithCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = candies[0];

        // Find maximum
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();

        // Check each kid
        for (int i = 0; i < candies.length; i++) {

            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of kids: ");
        int n = sc.nextInt();

        int[] candies = new int[n];

        // Input candies
        System.out.println("Enter candies for each kid:");

        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }

        System.out.print("Enter extra candies: ");
        int extraCandies = sc.nextInt();

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println(result);

        sc.close();
    }
}