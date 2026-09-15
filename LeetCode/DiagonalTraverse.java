package LeetCode;

/*
        LeetCode 498 - Diagonal Traverse
:

        ↗ UP-RIGHT
           i--
           j++

        ↙ DOWN-LEFT
           i++
           j--

        We keep changing direction whenever
        we reach a boundary.

        i = row
        j = column

        IMPORTANT:
        i == 0           → top boundary
        i == rows - 1    → bottom boundary
        j == 0           → left boundary
        j == cols - 1    → right boundary
    */


import java.util.Arrays;

public class DiagonalTraverse {
     public static int[] findDiagonalOrder(int[][] mat) {

        int rows = mat.length;
        int columns = mat[0].length;

        // Answer array
        int[] result = new int[rows * columns];

        // Starting 
        int i = 0;
        int j = 0;

        // direction = 1  → UP-RIGHT ↗ & direction = -1 → DOWN-LEFT ↙

        int direction = 1;

        for (int k = 0; k < rows * columns; k++) {

            result[k] = mat[i][j];

            // UP-RIGHT ↗
            if (direction == 1) {

                //  at the right boundary
                if (j == columns - 1) {
                    i++;
                    direction = -1;
                }

                // at the top boundary
                else if (i == 0) {
                    j++;
                    direction = -1;
                }

                // Continue moving UP-RIGHT
                else {
                    i--;
                    j++;
                }
            }

            // DOWN-LEFT ↙
            else {

                //  at the bottom boundary
                if (i == rows - 1) {
                    j++;
                    direction = 1;
                }

                //  at the left boundary
                else if (j == 0) {
                    i++;
                    direction = 1;
                }

                // Continue moving DOWN-LEFT
                else {
                    i++;
                    j--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] answer = findDiagonalOrder(matrix);

        System.out.println(Arrays.toString(answer));
    }
}
