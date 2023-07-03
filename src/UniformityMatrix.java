public class UniformityMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] uniformityMatrix = calculateUniformityMatrix(matrix);
        displayMatrix(uniformityMatrix);
    }

    public static int[][] calculateUniformityMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] uniformityMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                uniformityMatrix[i][j] = calculateUniformity(matrix, i, j);
            }
        }

        return uniformityMatrix;
    }

    public static int calculateUniformity(int[][] matrix, int row, int col) {
        int value = matrix[row][col];
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == value) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}