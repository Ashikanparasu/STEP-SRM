public class MatrixDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 5, 7},
            {3, 6, 1},
            {8, 4, 9}
        };

        int n = matrix.length;

        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        int mainDiagonalProduct = 1;
        int secondaryDiagonalProduct = 1;

        // Loop for main diagonal sum
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
        }

        // Loop for main diagonal product
        for (int i = 0; i < n; i++) {
            mainDiagonalProduct *= matrix[i][i];
        }

        // Loop for secondary diagonal sum
        for (int i = 0; i < n; i++) {
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }

        // Loop for secondary diagonal product
        for (int i = 0; i < n; i++) {
            secondaryDiagonalProduct *= matrix[i][n - 1 - i];
        }

        System.out.println("Main Diagonal Sum: " + mainDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
        System.out.println("Main Diagonal Product: " + mainDiagonalProduct);
        System.out.println("Secondary Diagonal Product: " + secondaryDiagonalProduct);
    }
}
