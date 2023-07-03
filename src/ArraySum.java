public class ArraySum {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maxRowSum = findMaxRowSum(array);
        int maxColumnSum = findMaxColumnSum(array);

        System.out.println("Sum of each row:");
        printArray(findRowSums(array));

        System.out.println("Sum of each column:");
        printArray(findColumnSums(array));

        System.out.println("Row with maximum sum: " + maxRowSum);
        System.out.println("Column with maximum sum: " + maxColumnSum);
    }

    public static int[] findRowSums(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[] rowSums = new int[rows];

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
            rowSums[i] = sum;
        }

        return rowSums;
    }

    public static int[] findColumnSums(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[] columnSums = new int[cols];

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += array[i][j];
            }
            columnSums[j] = sum;
        }

        return columnSums;
    }

    public static int findMaxRowSum(int[][] array) {
        int[] rowSums = findRowSums(array);
        int maxSum = rowSums[0];

        for (int i = 1; i < rowSums.length; i++) {
            if (rowSums[i] > maxSum) {
                maxSum = rowSums[i];
            }
        }

        return maxSum;
    }

    public static int findMaxColumnSum(int[][] array) {
        int[] columnSums = findColumnSums(array);
        int maxSum = columnSums[0];

        for (int i = 1; i < columnSums.length; i++) {
            if (columnSums[i] > maxSum) {
                maxSum = columnSums[i];
            }
        }

        return maxSum;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}