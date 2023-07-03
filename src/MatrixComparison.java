public class MatrixComparison {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        boolean areEqual = compareMatrices(matrix1, matrix2);

        if (areEqual) {
            System.out.println("The matrices are the same.");
        } else {
            System.out.println("The matrices are different.");
        }
    }

    public static boolean compareMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        if (rows != matrix2.length || cols != matrix2[0].length) {
            return false; // Matrices have different dimensions
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false; // Matrices have different elements
                }
            }
        }

        return true; // Matrices are the same
    }
}