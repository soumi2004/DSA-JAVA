package LeetCode;

import java.util.*;

public class FlippingAnImage {

    /*
        LeetCode 832 - Flipping an Image

        MAIN IDEA:
        We have to do TWO things:

        1. Reverse each row
        2. Flip 0 → 1 and 1 → 0

        So:

        832 = REVERSE + INVERT


        To reverse a row:
        Use TWO POINTERS

        left  → starts from beginning
        right → starts from end

        Swap them and move:

        left++
        right--


        To invert:

        0 → 1
        1 → 0

        Easy formula:

        1 - value

        Because:

        1 - 0 = 1
        1 - 1 = 0
    */

    public static int[][] flipAndInvertImage(int[][] image) {

        // Go through every row
        for (int i = 0; i < image.length; i++) {

            // Two pointers
            int left = 0;
            int right = image[i].length - 1;

            // Reverse + invert
            while (left <= right) {

                // Store the left value temporarily
                int temp = image[i][left];

                // Put inverted right value on the left
                image[i][left] = 1 - image[i][right];

                // Put inverted left value on the right
                image[i][right] = 1 - temp;

                // Move towards the middle
                left++;
                right--;
            }
        }

        return image;
    }

    public static void main(String[] args) {

        // Input matrix
        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        // Call the method
        int[][] answer = flipAndInvertImage(image);

        // Print the result
        for (int i = 0; i < answer.length; i++) {
            System.out.println(Arrays.toString(answer[i]));
        }
    }
}