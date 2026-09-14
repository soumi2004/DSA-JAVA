package LeetCode;

import java.util.*;

public class SpiralMatrixII {

    /*
        LeetCode 59 - Spiral Matrix II

        MAIN IDEA:

        Create an n x n matrix and fill it
        with numbers from 1 to n² in SPIRAL order.

        --------------------------------

        STEP 1:
        Fill TOP row →→→

        Then:
        top++

        STEP 2:
        Fill RIGHT column ↓↓↓

        Then:
        right--

        STEP 3:
        Fill BOTTOM row ←←←

        Then:
        bottom--

        STEP 4:
        Fill LEFT column ↑↑↑

        Then:
        left++


        --------------------------------


        After each side:

        top++
        right--
        bottom--
        left++

        value++ means:
        put current number, then increase it.
    */

    public static int[][] generateMatrix(int n) {

        // Create n x n matrix
        int[][] matrix = new int[n][n];

        // Four boundaries
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        // Number to put into the matrix
        int value = 1;

        // Continue until all boundaries meet
        while (top <= bottom && left <= right) {
           
            // 1. TOP ROW
          
            for (int j = left; j <= right; j++) {
                matrix[top][j] = value++;
            }

            top++;

            // 2. RIGHT COLUMN 

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }

            right--;

            // 3. BOTTOM ROW 

            if (top <= bottom) {

                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = value++;
                }

                bottom--;
            }

            // 4. LEFT COLUMN 

            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }

                left++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {

        // Size of matrix
        int n = 3;

        int[][] answer = generateMatrix(n);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(Arrays.toString(answer[i]));
        }
    }
}
