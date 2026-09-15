package LeetCode;

   /*
        LeetCode 73 - Set Matrix Zeroes

        If a cell is 0:

        → make its entire ROW = 0
        → make its entire COLUMN = 0

        i = row
        j = column

        zeroRows[i] = true
            → row i become zero

        zeroCols[j] = true
            → column j  become zero

        Finally:
        if row OR column is marked,
        make that cell 0.
    */

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        // Store which rows contain 0
        boolean[] zeroRows = new boolean[rows];

        // Store which columns contain 0
        boolean[] zeroCols = new boolean[columns];


        // Find all zeroes row and column

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                if (matrix[i][j] == 0) {

                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Make marked rows and columns zero

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                // If row OR column was marked, make this block zero

                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

     public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        setZeroes(matrix);

        // Print matrix
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
