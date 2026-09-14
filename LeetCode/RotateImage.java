package LeetCode;

/*
        LeetCode 48 - Rotate Image

        MAIN IDEA:

        Rotate matrix 90° clockwise using 2 steps:

        STEP 1 → TRANSPOSE
        STEP 2 → REVERSE EACH ROW

        STEP 1: TRANSPOSE

        Transpose = rows become columns.

        Swap:

        matrix[i][j]
              ↕
        matrix[j][i]

         STEP 2: REVERSE EACH ROW

        Use TWO POINTERS:

        left  → starts from beginning
        right → starts from end

        Swap them.

        Then:

        left++
        right--

         Transpose pattern:
        [i][j] ↔ [j][i]

        Reverse pattern:
        left ↔ right
    */


import java.util.Arrays;

public class RotateImage {
     public static void rotate(int[][] matrix) {

        int n = matrix.length;
       
        // STEP 1: TRANSPOSE THE MATRIX

        for (int i = 0; i < n; i++) {

            // Start from i + 1
            // to avoid swapping twice
            for (int j = i + 1; j < n; j++) {

                // Store current value
                int temp = matrix[i][j];

                // Swap matrix[i][j] and matrix[j][i]
                matrix[i][j] = matrix[j][i];

                matrix[j][i] = temp;
            }
        }
         // STEP 2: REVERSE EVERY ROW
        
        for (int i = 0; i < n; i++) {

            // Two pointers
            int left = 0;
            int right = n - 1;

            while (left < right) {

                // Swap left and right
                int temp = matrix[i][left];

                matrix[i][left] = matrix[i][right];

                matrix[i][right] = temp;

                // Move towards the middle
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Rotate the matrix
        rotate(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
