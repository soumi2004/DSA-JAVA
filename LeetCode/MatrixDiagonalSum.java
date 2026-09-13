package LeetCode;



public class MatrixDiagonalSum {

    public static int diagonalSum(int[][] matrix) {

        // n = number of rows
        int n = matrix.length;

        // Stores the answer
        int sum = 0;

        // Visit every row
        for (int i = 0; i < n; i++) {

            // Primary diagonal
            // Pattern: [i][i]
            sum += matrix[i][i];

            // Secondary diagonal
            // Pattern: [i][n - 1 - i]
            //
            // Don't add if it is the same center element
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        // Create the matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Call the method and give it the matrix
        int answer = diagonalSum(matrix);

        // Print the answer
        System.out.println("Diagonal Sum = " + answer);
    }
}